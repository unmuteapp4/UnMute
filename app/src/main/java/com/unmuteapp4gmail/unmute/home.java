package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void goToActivity1 (View view){
        Intent intent = new Intent (this, login.class);
        startActivity(intent);
    }

    public void goToActivity2 (View view){
        Intent intent = new Intent (this, Donate.class);
        startActivity(intent);
    }

    public void goToActivity3 (View view){
        Intent intent = new Intent (this, About.class);
        startActivity(intent);
    }









}
