package com.example.imharindersing.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreForTeamA = 0, scoreForTeamB = 0;

    public void addThreeForTeamA(View v){
        displayForTeamA(3);
    }

    public void addThreeForTeamB(View v){
        displayForTeamB(3);
    }

    public void addTwoForTeamA(View v){
        displayForTeamA(2);
    }

    public void addTwoForTeamB(View v){
        displayForTeamB(2);
    }

    public void addOneForTeamA(View v){
        displayForTeamA(1);
    }

    public void addOneForTeamB(View v){
        displayForTeamB(1);
    }

    public void resetScores(View v){
        displayForTeamA(0);
        displayForTeamB(0);
    }

    private void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreForTeamA += score;
        if(score == 0)
            scoreForTeamA = 0;
        scoreView.setText(String.valueOf(scoreForTeamA));
    }

    private void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreForTeamB += score;
        if(score == 0)
            scoreForTeamB = 0;
        scoreView.setText(String.valueOf(scoreForTeamB));
    }
}
