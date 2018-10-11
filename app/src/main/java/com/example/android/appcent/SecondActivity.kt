package com.example.android.appcent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val navBarTitle = intent.getStringExtra("Welcome_page")
        supportActionBar?.title = navBarTitle

        var strUser: String = intent.getStringExtra("Username")

        textview_label.setText(strUser)













    }
}

