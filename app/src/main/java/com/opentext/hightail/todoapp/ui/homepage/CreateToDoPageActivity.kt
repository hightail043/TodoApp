package com.opentext.hightail.todoapp.ui.homepage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.opentext.hightail.todoapp.R

class CreateToDoPageActivity: AppCompatActivity() {
    lateinit var saveBtn: Button
    lateinit var cancelBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createtodopage)
        initViews()
    }
    private fun initViews() {
        saveBtn = findViewById(R.id.btnSaveToDo)
        saveBtn.setOnClickListener {
            Log.d(TAG, "Save Button Clicked")
            launchHomePage()
        }
        cancelBtn = findViewById(R.id.btnCancel)
        cancelBtn.setOnClickListener {
            Log.d(TAG, "Cancel button clicked")
            launchHomePage()
        }
    }

    private fun launchHomePage() {
        val intent = Intent(this, HomePageActivity::class.java)
        startActivity(intent)
    }

    companion object {
        private const val TAG = "CreateToDoPageActivity"
    }
}