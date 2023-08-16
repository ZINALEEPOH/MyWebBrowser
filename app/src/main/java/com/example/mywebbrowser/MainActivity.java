package com.example.mywebbrowser;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView wvMyPage;
    private Button btnLoadURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvMyPage = findViewById(R.id.webView);
        btnLoadURL = findViewById(R.id.buttonLoadUrl);

        WebViewClient webViewClient = new WebViewClient();
        wvMyPage.setWebViewClient(webViewClient);

        WebSettings webSettings = wvMyPage.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.rp.edu.sg/soi/home";
                wvMyPage.loadUrl(url);
            }
        });
    }
}