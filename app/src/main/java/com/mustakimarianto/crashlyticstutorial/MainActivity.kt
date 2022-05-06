package com.mustakimarianto.crashlyticstutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mustakimarianto.crashlyticstutorial.databinding.ActivityMainBinding
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCrash.setOnClickListener {
            throw RuntimeException("App Crash")
        }
    }
}