package com.example.fisrtapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.time.Instant

class addListActivity : AppCompatActivity() {

    private lateinit var editText: EditText

    public override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_add_list)
        editText = findViewById(R.id.button)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(editText.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val user = editText.text.toString()
                replyIntent.putExtra(EXTRA_REPLY, user)
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()
        }
    }

    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"

    }
}