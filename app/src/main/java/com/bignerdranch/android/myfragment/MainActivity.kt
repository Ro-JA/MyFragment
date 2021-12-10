package com.bignerdranch.android.myfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.bignerdranch.android.myfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bFr2.setOnClickListener {
            supportFragmentManager
                .beginTransaction().replace(R.id.place_holder, BlankFragment2.newInstance())
                .commit()
        }

        supportFragmentManager
            .beginTransaction().replace(R.id.place_holder, BlankFragment.newInstance()).commit()
    }
}