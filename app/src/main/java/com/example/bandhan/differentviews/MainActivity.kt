package com.example.bandhan.differentviews

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnLoginClicked(view: View){
        if(username.text.toString().equals("admin") && password.text.toString().equals("admin123")){
            val intent = Intent(this,DifferentFoods::class.java)
            startActivity(intent)
            finish()
        } else{
            Toast.makeText(this,"Invalid username or password",Toast.LENGTH_SHORT).show()
        }
    }


}
