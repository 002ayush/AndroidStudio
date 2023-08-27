package com.example.implicit_explicit

import android.annotation.SuppressLint
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val WebViewVariable = findViewById<WebView>(R.id.WebView)
        WebViewSetUp(WebViewVariable)
    }
    @SuppressLint("SetJavaScriptEnabled")
    private fun WebViewSetUp(webView: WebView)
    {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.youtube.com/")
        }
    }

}