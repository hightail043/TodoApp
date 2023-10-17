package com.opentext.hightail.todoapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.opentext.hightail.todoapp.R

class LoginErrorActivity : AppCompatActivity() {
    lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginerrormessage)
        initViews()
    }

    private fun initViews() {
        backBtn = findViewById(R.id.btnBackToLoginPageFromSignInError)
        backBtn.setOnClickListener {
            Log.d(TAG, "Back to Login Page button clicked")
            launchLoginScreen()
        }
    }

    private fun launchLoginScreen() {
        intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    companion object {
        private const val TAG = "LoginErrorActivity"
    }
}