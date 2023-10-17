package com.opentext.hightail.todoapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.opentext.hightail.todoapp.R
import com.opentext.hightail.todoapp.ui.homepage.HomePageActivity
import com.opentext.hightail.todoapp.ui.signup.SignUpActivity

class LoginActivity : AppCompatActivity() {
    lateinit var signUpBtn:Button
    lateinit var signInBtn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initViews()
    }

    private fun initViews() {
        signInBtn = findViewById(R.id.btnSignIn)
        signInBtn.setOnClickListener {
            Log.d(TAG, "SignIn Button Clicked")
            launchHomeScreen()
        }
        signUpBtn = findViewById(R.id.btnSignUp)
        signUpBtn.setOnClickListener {
            Log.d(TAG, "SignUp button clicked")
            launchSignUpScreen()
        }
    }

    private fun launchHomeScreen() {
        val intent = Intent(this, HomePageActivity::class.java)
        startActivity(intent)
    }

    private fun launchSignUpScreen() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    companion object {
        private const val TAG = "LoginActivity"
    }
}