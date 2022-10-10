package com.shubham.kotlinfirst

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.sdsmdg.tastytoast.SuccessToastView
import com.sdsmdg.tastytoast.TastyToast

class MainActivity : AppCompatActivity() {

    var countNumber : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.createBtn);
        val name = findViewById<EditText>(R.id.enterYourName);
        button.setOnClickListener {
            val intent =  Intent(this,BirthdayScreen::class.java);
            intent.putExtra(BirthdayScreen.NAME_EXTRA,name.editableText.toString())
            TastyToast.makeText(this,"Your name saved Successfully!",TastyToast.LENGTH_SHORT,TastyToast.SUCCESS);
            startActivity(intent);
        }
    }
}