package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

    public void goToActivity8 (View view){
        Intent intent = new Intent (this, TextSpeech.class);
        startActivity(intent);
    }

    public void goToActivity10 (View view){
        Intent intent = new Intent (this, Jobs.class);
        startActivity(intent);
    }

    public void goToActivity12 (View view){
        Intent intent = new Intent (this, Games.class);
        startActivity(intent);
    }

    public void goToActivity21 (View view){
        Intent intent = new Intent (this, Tests.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Student.this,login.class);
        startActivity(intent);

    }
}
