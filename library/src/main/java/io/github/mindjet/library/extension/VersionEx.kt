package io.github.mindjet.library.extension

import android.os.Build

/**
 * Created by Mindjet on 2017/10/17.
 */

inline fun aboveApi(api: Int, body: () -> Any) {
    if (Build.VERSION.SDK_INT >= api) {
        body()
    }
}

inline fun aboveLollipop(body: () -> Any) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        body()
    }
}