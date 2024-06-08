package com.example.web

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


lateinit var weeb: WebView
lateinit var searching: Button
lateinit var inputLink: EditText
lateinit var btn1: Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weeb = findViewById(R.id.browser)
        searching = findViewById(R.id.btn_search)
        inputLink = findViewById(R.id.input_url)
        btn1 = findViewById(R.id.btn_screen1)


        searching.setOnClickListener {
            weeb.loadUrl(inputLink.text.toString())
            weeb.settings.javaScriptEnabled = true
            weeb.webViewClient = WebViewClient()
        }


        btn1.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }
    }
}
