package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void onBackPressed() {
        Intent intent = new Intent(Admin.this, login.class);
        startActivity(intent);
    }
}
