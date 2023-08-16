package com.opentext.hightail.todoapp.loginActivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.opentext.hightail.todoapp.R
import com.opentext.hightail.todoapp.signUpActivity.SignUpActivity
import com.opentext.hightail.todoapp.util.Constants.EXTRA_USER_EMAIL

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}