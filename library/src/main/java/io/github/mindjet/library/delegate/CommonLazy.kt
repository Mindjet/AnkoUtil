package io.github.mindjet.library.delegate

import android.app.Activity
import android.view.View
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by Mindjet on 2017/10/25.
 */
class CommonLazy<in T, out R>(private val initializer: (T, KProperty<*>) -> R) : ReadOnlyProperty<T, R> {

    private var value: R? = null

    override fun getValue(thisRef: T, property: KProperty<*>): R {
        if (value == null) {
            value = initializer(thisRef, property)
        }
        @Suppress("UNCHECKED_CAST")
        return value as R
    }

}

fun <T : View> Activity.bindView(id: Int): CommonLazy<Activity, T> {
    return CommonLazy { activity, prop ->
        activity.findViewById(id) ?: viewNotFound(activity, id, prop)
    }
}

fun <T> viewNotFound(activity: Activity, id: Int, kProperty: KProperty<T>): Nothing {
    throw ClassNotFoundException("View id $id is not found for ${kProperty.name} in ${activity::class.simpleName}")
}