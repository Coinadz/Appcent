package com.example.android.appcent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    val userName = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Login to Appcent"

        button_login.setOnClickListener {

            val intent = Intent(this@MainActivity, SecondActivity::class.java);

            var userName = name_name.text.toString()
            intent.putExtra("Username", userName)
            intent.putExtra("Welcome_page", "Welcome to Appcent")

            if (name_name.text.isNotEmpty() && birth_date.text.isNotEmpty()) {

                startActivity(intent);

            } else {
                Toast.makeText(applicationContext, "Please fill in full name and birth date!", Toast.LENGTH_SHORT).show()
            }
        }


        val adapter = ArrayAdapter.createFromResource(this,
                R.array.city_list, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter



        fun getValues(view: View) {
            Toast.makeText(this, "Spinner 1 " + spinner.selectedItem.toString() +
                    spinner.selectedItem.toString(), Toast.LENGTH_LONG).show()
        }
    }
}




