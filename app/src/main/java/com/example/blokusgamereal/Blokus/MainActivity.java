package com.example.blokusgamereal.Blokus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.blokusgamereal.Blokus.BlokusInfo.BlokusGameState;
import com.example.blokusgamereal.R;

public class MainActivity extends AppCompatActivity {
    private BlokusGameState myState = new BlokusGameState();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button helpButton = (Button) findViewById(R.id.helpButton);
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("RandomTag", myState.toString() );
            }
        });
    }
}