package com.opentext.hightail.todoapp.ui.signup

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.opentext.hightail.todoapp.R

class SignUpActivity : AppCompatActivity() {
    lateinit var signUpConfirmBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        initViews()
    }

    private fun initViews() {
        signUpConfirmBtn = findViewById(R.id.btnSignUpConfirm)
        signUpConfirmBtn.setOnClickListener {
            Log.d(TAG, "SignUp-Confirm button clicked")
        }
    }



    companion object {
        private const val TAG = "SignUpActivity"
    }

}