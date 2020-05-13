package com.manuflowers.trainingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Data types: When you want to declare a variable meaning that it's value can be changed, you use var
    //If you don't want the value change you use val
    fun main() {
        var age = 20
        val name = "Manu"
    }
}
