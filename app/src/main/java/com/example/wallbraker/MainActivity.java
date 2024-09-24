package com.example.wallbraker;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GameView game= new GameView(this);
        game.setBackgroundColor(Color.BLACK);
        setContentView(game);
    }
}