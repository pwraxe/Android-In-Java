package com.example.opengoogle_fb;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView google,fb;
    WebView webView;
    String url;


    // note : Dont forget internet permission


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openURL();

    }
    public void openURL()
    {
        google = findViewById(R.id.googleCard);
        fb = findViewById(R.id.fbCard);
        webView = findViewById(R.id.webID);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://www.google.com";
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://www.facebook.com";
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);

            }
        });

    }

}
