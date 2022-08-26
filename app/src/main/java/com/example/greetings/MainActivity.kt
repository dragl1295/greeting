package com.example.greetings

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.greetings.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun birthday(view: View) {
      val name =  binding.nameInput.editableText.toString()
        val intent = Intent(this, birthdayGreetActivity::class.java)
        intent.putExtra(birthdayGreetActivity.NAME_EXTRA, name)

        startActivity(intent)

    }
}