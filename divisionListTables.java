package com.example.android.yvpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Paul on 02/11/2016.
 */

public class divisionListTables extends AppCompatActivity {

    public void leagueTableWR1(View view) {
        Intent leagueTableWR1Intent = new Intent(this, WR1Table.class);

        // Start the new activity
        startActivity(leagueTableWR1Intent);
    }
}

