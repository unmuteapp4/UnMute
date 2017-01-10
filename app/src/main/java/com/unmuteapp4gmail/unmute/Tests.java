package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests);
    }

    public void goToActivity19 (View view){
        Intent intent = new Intent (this, English.class);
        startActivity(intent);
    }

    public void goToActivity20 (View view){
        Intent intent = new Intent (this, Mathematics.class);
        startActivity(intent);
    }
}
