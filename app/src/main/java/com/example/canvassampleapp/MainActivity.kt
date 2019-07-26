package com.example.canvassampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myCanvas : MyCanvas  = MyCanvas(this)

        setContentView(myCanvas)
    }
}
