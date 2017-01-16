package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mathematics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics);


    }

    public void goToActivity25(View view){
        Intent intent = new Intent(this, Arithmatic.class);
        startActivity(intent);

    }

    public void goToActivity28(View view){
        Intent intent = new Intent(this, Probability.class);
        startActivity(intent);

    }

    public void goToActivity29(View view){
        Intent intent = new Intent(this, Logic.class);
        startActivity(intent);

    }


}
