package com.bignerdranch.android.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var count: Int = 0
    private var display: TextView? = null
    private var btn: Button? = null

    class Counter {
        private var mcount: Int = 0

        fun addCount() {
            mcount++
        }

        fun getCount(): Int {
            return mcount
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = Counter().getCount()
        display = findViewById(R.id.tv1)
        btn = findViewById(R.id.btn1)

        btn!!.setOnClickListener{
            Counter().addCount()

            display?.text = count.toString()
        }
    }
}