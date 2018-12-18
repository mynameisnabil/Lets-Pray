package com.example.test.letspray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class doa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);
        WebView web = (WebView) findViewById(R.id.web_view);
        web.loadUrl("https://litequran.net");
        web.setWebViewClient(new WebViewClient());
    }

}