package io.github.mindjet.library

import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * Created by Mindjet on 2017/9/6.
 */
val testString = "This is a string."
var toast: Toast? = null

inline fun <reified T> T.log(log: Any) {
    Log.e(T::class.simpleName, log.toString())
}

inline fun <reified T> T.logSomething() {
    Log.e(T::class.simpleName, testString)
}

fun Context.toast(content: Any) {
    toastSafely(this, content.toString())
}

private fun toastSafely(context: Context, string: String) {
    if (toast == null) {
        toast = Toast.makeText(context, string, Toast.LENGTH_SHORT)
    } else {
        toast?.setText(string)
    }
    toast?.show()
}