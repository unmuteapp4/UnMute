package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DonatePhone2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_phone2);
    }

    public void goToActivity23 (View view){
        Intent intent = new Intent (this, DonatePhone.class);
        startActivity(intent);
    }
}
