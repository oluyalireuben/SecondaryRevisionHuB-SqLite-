package com.example.secondaryrevisionhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class FormOneActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_one);


        webView = findViewById(R.id.webview);
        webView.loadUrl("https://esomake.co.ke/secondary/form-1/");

    }
}