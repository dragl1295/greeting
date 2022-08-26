package com.example.greetings

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.greetings.databinding.ActivityBirthdayGreetBinding

class birthdayGreetActivity : AppCompatActivity() {
     companion object{
        const val NAME_EXTRA ="name_extra"
    }
   private lateinit var binding: ActivityBirthdayGreetBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(NAME_EXTRA)
      binding.textView2.text = "Happy Birthday $name"

    }

}

