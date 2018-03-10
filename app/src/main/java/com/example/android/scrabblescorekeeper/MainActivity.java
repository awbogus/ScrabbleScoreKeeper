package com.example.android.scrabblescorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int newPlayer1;
    int newPlayer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getScore1(){
        EditText getScore1 = (EditText) findViewById(R.id.player1Initial);
        newPlayer1 = Integer.parseInt(getScore1.getText().toString());

    }

    public void noBonus1 (View view){
        getScore1();
        scoreTeamA = scoreTeamA + newPlayer1;
        displayForTeamA(scoreTeamA);
    }


    public void doublePlayer1(View view) {
        getScore1();
        scoreTeamA = scoreTeamA + (newPlayer1 * 2);
        displayForTeamA(scoreTeamA);
    }

    public void triplePlayer1(View view) {
        getScore1();
        scoreTeamA = scoreTeamA + (newPlayer1 * 3);
        displayForTeamA(scoreTeamA);
    }






    public void getScore2(){
        EditText getScore2 = (EditText) findViewById(R.id.player2Initial);
        newPlayer2 = Integer.parseInt(getScore2.getText().toString());

    }

    public void noBonus2 (View view){
        getScore2();
        scoreTeamB = scoreTeamB + newPlayer2;
        displayForTeamB(scoreTeamB);
    }



    public void doublePlayer2(View view) {
        getScore2();
        scoreTeamB = scoreTeamB + (newPlayer2 * 2);
        displayForTeamB(scoreTeamB);
    }

    public void triplePlayer2(View view) {
        getScore2();
        scoreTeamB = scoreTeamB + (newPlayer2 * 3);
        displayForTeamB(scoreTeamB);
    }




    /**
     * This method is called when reset is clicked.
     */
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1Score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2Score);
        scoreView.setText(String.valueOf(score));
    }
}


