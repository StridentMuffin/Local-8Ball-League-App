package com.example.android.yvpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scoreboard (View view){
        Intent scoreboardIntent = new Intent(MainActivity.this, scoreboard.class);

        // Start the new activity
        startActivity(scoreboardIntent);
    }

    public void leagueTable (View view){
        Intent leagueTablePickerIntent = new Intent (MainActivity.this, WR1Table.class);

        startActivity(leagueTablePickerIntent);
    }

    public void playerAverages (View view){
        Intent playerAveragesIntent = new Intent(this,playerAverages.class);
        startActivity(playerAveragesIntent);
    }


}
