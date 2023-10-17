package com.opentext.hightail.todoapp.ui.homepage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.opentext.hightail.todoapp.R

class HomePageActivity: AppCompatActivity() {

    lateinit var createToDoBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        initViews()
    }

    private fun initViews() {
        createToDoBtn = findViewById(R.id.btnCreateTask)
        createToDoBtn.setOnClickListener {
            Log.d(TAG, "Create Task Button Clicked")
            launchCreateToDoScreen()
        }
    }

    private fun launchCreateToDoScreen() {
        val intent = Intent(this, CreateToDoPageActivity::class.java)
        startActivity(intent)
    }

    companion object {
        private const val TAG = "HomePageActivity"
    }
}