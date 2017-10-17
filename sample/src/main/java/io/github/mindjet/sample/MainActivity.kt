package io.github.mindjet.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.mindjet.library.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }

    fun test() {
        log("hahah")
        logSomething()
        log(testString)
//        toast(testString)
        aboveApi(21) {
            toast(testString)
        }
    }


}

