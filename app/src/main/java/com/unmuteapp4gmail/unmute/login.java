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


    public void goToActivity4 (String activity){
        Intent intent = new Intent (this, String.class);
        startActivity(intent);
    }

    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {
            case R.id.btnSubmit:

                Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
                String text = mySpinner.getSelectedItem().toString();
                if (text.equals("Volunteer")) {
                   goToActivity4("Volunteer");
                }

                else if (text.equals("Student")) {
                  goToActivity4("Student");
               }

                else {
                    goToActivity4("Admin");
                }

                break;
        }

    }

}


