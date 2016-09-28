package com.example.android.scorecounter;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int teamAScore=0;
    int teamBScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayTeamAScore(int Score){
        TextView teamAPoint= (TextView) findViewById(R.id.team_A_score);
        teamAPoint.setText(String.valueOf(Score));
    }
    public void safelyTeamA(View view){
           teamAScore=teamAScore+2;
        displayTeamAScore(teamAScore);
    }
    public void fieldGoalTeamA(View view){
        teamAScore=teamAScore+3;
        displayTeamAScore(teamAScore);
    }
    public void touchDownTeamA(View view){
        teamAScore=teamAScore+6;
        displayTeamAScore(teamAScore);
    }
    public void displayTeamBScore(int Score){
        TextView teamBPoint= (TextView) findViewById(R.id.team_B_score);
        teamBPoint.setText(String.valueOf(Score));
    }
    public void safelyTeamB(View view){
        teamBScore=teamBScore+2;
        displayTeamBScore(teamBScore);
    }
    public void fieldGoalTeamB(View view){
        teamBScore=teamBScore+3;
        displayTeamBScore(teamBScore);
    }
    public void touchDownTeamB(View view){
        teamBScore=teamBScore+6;
        displayTeamBScore(teamBScore);
    }
    public void reset(View view){
        teamAScore=0;
        teamBScore=0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);
    }
}
