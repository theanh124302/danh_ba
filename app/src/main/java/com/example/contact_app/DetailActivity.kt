package com.example.contact_app


import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)

        try {
            var id = intent.getStringExtra("id")
            var name = intent.getStringExtra("username")
            var phone = intent.getStringExtra("phone")
            var email = intent.getStringExtra("email")

            var idText = findViewById<TextView>(R.id.info_id)
            var nameText = findViewById<TextView>(R.id.info_name)
            var phoneText = findViewById<TextView>(R.id.info_phone)
            var emailText = findViewById<TextView>(R.id.info_mail)

            idText.text = "ID : " + id
            nameText.text = "Name : " + name
            phoneText.text = "Phone : " + phone
            emailText.text = "Mail : " + email
        }catch (ex: Exception) {
            setResult(Activity.RESULT_CANCELED)
        }

        var back = findViewById<Button>(R.id.back_button)
        back.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}