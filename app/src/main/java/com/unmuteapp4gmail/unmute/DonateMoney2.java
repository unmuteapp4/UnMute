package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DonateMoney2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_money2);
    }

    public void goToActivity22 (View view){
        Intent intent = new Intent (this, DonateMoney.class);
        startActivity(intent);
    }
}
