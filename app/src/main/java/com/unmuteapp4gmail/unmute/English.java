package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);


    }

    public void goToActivity24(View view){
        Intent intent = new Intent(this, Sentence.class);
        startActivity(intent);

    }

    public void goToActivity26(View view){
        Intent intent = new Intent(this, Tenses.class);
        startActivity(intent);

    }

    public void goToActivity27(View view){
        Intent intent = new Intent(this, Grammar.class);
        startActivity(intent);

    }
}
