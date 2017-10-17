package io.github.mindjet.library

import android.app.Activity

/**
 * Created by Mindjet on 2017/10/17.
 */
inline fun <reified T> Activity.start() {

    this.startActivity(android.content.Intent(this, T::class.java))

}