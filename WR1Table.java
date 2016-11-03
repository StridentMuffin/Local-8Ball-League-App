package com.example.android.yvpapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import static android.R.attr.data;
import static android.R.attr.label;
import static android.R.attr.name;
import static android.R.attr.tabWidgetStyle;
import static android.R.attr.value;

/**
 * Created by Paul on 31/10/2016.
 */

public class WR1Table extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.league_table);

        WebView webViewLeague1 = (WebView) findViewById(R.id.WebViewLeagueTable);
        webViewLeague1.loadUrl("http://yeovilpoolleague.co.uk/redseal/2016/TYPL%202016%20TAB%20DIVISION%20WR1.HTM");

        WebSettings webSettings = webViewLeague1.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
