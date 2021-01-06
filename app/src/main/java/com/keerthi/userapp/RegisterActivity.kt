package com.keerthi.userapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun bthome(view: View) {
        var rname=findViewById<EditText>(R.id.name);
        var rplace=findViewById<EditText>(R.id.place);
        var rphno=findViewById<EditText>(R.id.phone);
        var email=findViewById<EditText>(R.id.emailid);
           Toast.makeText(this,rname.text.toString()+" "+rplace.text.toString()+" "+email.text.toString()+" "+rphno.text.toString(),Toast.LENGTH_LONG).show();
    }

    fun btback(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}