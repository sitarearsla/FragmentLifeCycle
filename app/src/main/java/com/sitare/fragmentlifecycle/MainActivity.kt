package com.sitare.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTranslation = fragmentManager.beginTransaction()
        //in this fragment holder, add this fragment
        fragmentTranslation.add(R.id.fragment_holder_first, FirstFragment())
        fragmentTranslation.add(R.id.fragment_holder_second, SecondFragment())
        //to make it work
        fragmentTranslation.commit()
    }
}