package com.example.android.yvpapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Paul on 01/11/2016.
 */

public class playerAverages extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.league_table);

            WebView myWebView = (WebView) findViewById(R.id.WebViewLeagueTable);
            myWebView.loadUrl("http://yeovilpoolleague.co.uk/redseal/2016/TYPL%202016%20LP%20D2.HTM");

            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
    }


