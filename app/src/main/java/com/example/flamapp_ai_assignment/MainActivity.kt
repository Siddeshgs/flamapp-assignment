package com.example.flamapp_ai_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Load the native C++ library
    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }

    // Declare the JNI function
    external fun stringFromJNI(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Display JNI string in a TextView
        val tv = TextView(this)
        tv.text = stringFromJNI()
        setContentView(tv)
    }
}
