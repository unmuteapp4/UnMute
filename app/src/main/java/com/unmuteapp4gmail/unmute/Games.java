package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Games extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
    }

    public void goToActivity13 (View view){
        Intent intent = new Intent (this, Literacy.class);
        startActivity(intent);
    }

    public void goToActivity14 (View view){
        Intent intent = new Intent (this, Maths.class);
        startActivity(intent);
    }

    public void goToActivity15 (View view){
        Intent intent = new Intent (this, Memory.class);
        startActivity(intent);
    }
}
