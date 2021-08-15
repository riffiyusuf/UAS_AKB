// 13-08-2021-M Riffi Yusuf Hawarry-10118398
package com.jovanovic.stefan.mytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }
}