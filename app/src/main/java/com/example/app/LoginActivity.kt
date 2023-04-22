package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var emailEditText : EditText
    private lateinit var passwordEditText : EditText
    private lateinit var loginInButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()
        listeners()
    }

    private fun listeners() {

        loginInButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("EMAIL",email)
            intent.putExtra("PASSWORD",password)
            startActivity(intent)
            finish()
        }
    }

    private fun init() {
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginInButton = findViewById(R.id.loginInButton)
    }
}