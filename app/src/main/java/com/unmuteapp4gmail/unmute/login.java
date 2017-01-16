package com.unmuteapp4gmail.unmute;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }



    public void onClick(View view) {

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        String text = mySpinner.getSelectedItem().toString();

        if (text.compareTo("Volunteer") == 0) {
            Intent intent = new Intent (this, Volunteer.class);
            startActivity(intent);
        }

        else if (text.compareTo("Student")==0) {
            Intent intent = new Intent (this, Student.class);
            startActivity(intent);
        }

        else {
            Intent intent = new Intent (this, Admin.class);
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(login.this,home.class);
        startActivity(intent);

    }





}


