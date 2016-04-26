package com.example.qr_readerexample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by dcecilia on 25/04/2016.
 */
public class DetailViewActivity extends Activity{

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);


        Bundle b = getIntent().getExtras();
        String a = b.getString("url");
        Toast.makeText(this.getApplicationContext(), a, Toast.LENGTH_LONG).show();

        myWebView = (WebView) findViewById(R.id.webView);

        myWebView.setWebViewClient(new HelloWebViewClient());
        myWebView.loadUrl(a);


    }

    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }
}


