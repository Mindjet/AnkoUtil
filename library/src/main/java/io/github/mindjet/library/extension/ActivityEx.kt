package io.github.mindjet.library.extension

import android.app.Activity
import android.content.Intent

/**
 * Created by Mindjet on 2017/10/17.
 */
inline fun <reified T> Activity.start() {
    this.startActivity(Intent(this, T::class.java))
}
