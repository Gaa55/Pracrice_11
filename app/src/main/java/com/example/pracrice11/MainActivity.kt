package com.example.pracrice11

import android.graphics.Picture
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        }


    fun Picture(view: View){
        val iv: ImageView = findViewById(R.id.imageView)

        iv.setImageResource(R.drawable.pole)
    }
    var status:Boolean=false

    fun onClickImage(view: View)
    {
        val btn: ImageButton = view as ImageButton
        if (status==false)
        {
            btn.setImageResource(R.drawable.btn_on)
            status=true
        }
        else if(status==true)
        {
            btn.setImageResource(R.drawable.btn_off)
            status=false
        }
    }
}