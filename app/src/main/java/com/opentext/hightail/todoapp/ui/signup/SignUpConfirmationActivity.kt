package com.opentext.hightail.todoapp.ui.signup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.opentext.hightail.todoapp.R
import android.util.Log
import android.widget.Button
import com.opentext.hightail.todoapp.ui.login.LoginActivity

class SignUpConfirmationActivity : AppCompatActivity() {
    lateinit var backBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupconfirmation)
        initViews()
    }

    private fun initViews() {
        backBtn = findViewById(R.id.btnBackToLoginPageFromSignUpConfirm)
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
        private const val TAG = "SignUpConfirmationActivity"
    }
}