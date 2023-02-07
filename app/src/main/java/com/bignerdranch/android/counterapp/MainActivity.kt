package com.bignerdranch.android.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val count = Counter()
        val display = findViewById<TextView>(R.id.tv1)
        val btn = findViewById<Button>(R.id.btn1)

        btn!!.setOnClickListener{
            count.addCount()

            display?.text = count.getCount().toString()
        }
    }
}
public class Counter {
    var mcount: Int = 0

    fun addCount() {
        mcount++
    }

    fun getCount(): Int {
        return mcount
    }
}