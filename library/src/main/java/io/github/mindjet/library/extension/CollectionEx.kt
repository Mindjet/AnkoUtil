package io.github.mindjet.library.extension

/**
 * Created by Mindjet on 2017/10/25.
 */
fun Int.toStream(): Array<Any?> {
    return arrayOfNulls(this)
}