package com.keerthi.userapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btlogin(view: View) {
        var emailid=findViewById<EditText>(R.id.eid)
        Toast.makeText(this,emailid.text.toString(),Toast.LENGTH_LONG).show();
    }

    fun btregister(view: View) {
        intent= Intent(this,RegisterActivity::class.java);
        startActivity(intent);
    }
}