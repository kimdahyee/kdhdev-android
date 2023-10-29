package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kdhdevandroid.databinding.ActivityMainBinding
import com.example.kdhdevandroid.fcmtest.FCMTestActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFcm.setOnClickListener {
            intent = Intent(this, FCMTestActivity::class.java)
            startActivity(intent)
        }
    }
}