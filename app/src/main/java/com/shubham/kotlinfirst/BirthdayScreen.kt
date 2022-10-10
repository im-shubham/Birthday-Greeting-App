package com.shubham.kotlinfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayScreen : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_screen)
        val textView = findViewById<TextView>(R.id.textViewName);
        val name = intent.getStringExtra(NAME_EXTRA)
        textView.text = "Happy Birthday, $name"
    }


}