package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Jobs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
    }

    public void goToActivity16 (View view){
        Intent intent = new Intent (this, Companies.class);
        startActivity(intent);
    }

    public void goToActivity17 (View view){
        Intent intent = new Intent (this, Documents.class);
        startActivity(intent);
    }

    public void goToActivity18 (View view){
        Intent intent = new Intent (this, Seminars.class);
        startActivity(intent);
    }
}
