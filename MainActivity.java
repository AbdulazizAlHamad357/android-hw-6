package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> Movies = new ArrayList<>();

        Movie DragonBall = new Movie("Dragonball", "Goku", "10/10", "18+", "Shounen");
        Movie OnePiece = new Movie("OnePiece Stampede", "Luffy", "10/10", "13+", "Shounen")


    }
}