package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void sendMessage1(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(this, Donate.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}
