package ru.fefu.activitytracker.firstrsScreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.fefu.activitytracker.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registrationButton.setOnClickListener {
            startActivity(Intent(this, Registration::class.java))
        }

        binding.textQuestion.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

    }
}