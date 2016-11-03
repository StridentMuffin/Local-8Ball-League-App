package com.example.android.yvpapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;




public class scoreboard extends AppCompatActivity {

    int score1 = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scoreboard);
        //this sets the orientation on the device to be landscape. as this layout is designed to be in landscape mode//
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }


    public void plusScore1(View view) {
        score1 += 1;
        displayForPlayerA(score1);
    }

    public void plusScore2(View view) {
        score2 += 1;
        displayForPlayerB(score2);
    }

    public void minusScore1(View view) {
        if (score1 <= 0) {
            //TODO: May put a Toast message to say "Cannot have negative frames"
        } else {
            score1 -= 1;
            displayForPlayerA(score1);
        }
    }

    public void minusScore2(View view) {
        if (score2 <= 0) {

        } else {
            score2 -= 1;
            displayForPlayerB(score2);
        }
    }

    public String submitScore(View view) {

        EditText edit_text1 = (EditText) findViewById(R.id.name1);
        EditText edit_text2 = (EditText) findViewById(R.id.name2);
        //.getText().toString because return type of getText is char (character sequence)
        String resultMessage = edit_text1.getText().toString() + ": " + score1;
        resultMessage += "\n" + edit_text2.getText().toString() + ": " + score2;

        //Creates intent to mail result to email recipient, actually gives options to text aswell//
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Money League Result.");
        intent.putExtra(Intent.EXTRA_TEXT, resultMessage);
        startActivity(Intent.createChooser(intent, "Send Result"));

        return resultMessage;

    }

    public void displayForPlayerA(int score) {
        //Retrieves TextView to be updated, and sets the text to the String value of the int 'score'//
        TextView textScore1 = (TextView) findViewById(R.id.txtScore1);
        textScore1.setText(String.valueOf(score));
    }

    public void displayForPlayerB(int score) {
        //Retrieves TextView to be updated, and sets the text to the String value of the int 'score'//
        TextView textScore2 = (TextView) findViewById(R.id.txtScore2);
        textScore2.setText(String.valueOf(score));
    }


}
