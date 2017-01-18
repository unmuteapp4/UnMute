package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

public class login extends AppCompatActivity {
    EditText identityField, passwordField;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }


    public void onClick(View view) {

        initUI();
            Backendless.setUrl(Defaults.SERVER_URL);
            Backendless.initApp(this, Defaults.APPLICATION_ID, Defaults.SECRET_KEY, Defaults.VERSION);

            Backendless.UserService.isValidLogin(new DefaultCallback<Boolean>(this) {
                public void handleResponse(Boolean isValidLogin) {

                    if (isValidLogin && Backendless.UserService.CurrentUser() == null){
                        String currentUserId = Backendless.UserService.loggedInUser();

                        if (!currentUserId.equals("")) {
                            Backendless.UserService.findById(currentUserId, new DefaultCallback<BackendlessUser>(login.this, "Logging in...") {
                                public void handleResponse(BackendlessUser currentUser) {
                                    super.handleResponse(currentUser);
                                    Backendless.UserService.setCurrentUser(currentUser);
                                    finish();
                                }
                            });
                        }
                    }

                    super.handleResponse(isValidLogin);
                }
            });
        }

    private void initUI() {

        identityField = (EditText) findViewById(R.id.username);
        passwordField = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginButton);



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginButtonClicked();
            }
        });


    }
    public void onLoginButtonClicked () {
        String identity = identityField.getText().toString();
        String password = passwordField.getText().toString();

        char first= identity.charAt(0);
        if(first=='v'){

        Backendless.UserService.login(identity, password,new DefaultCallback<BackendlessUser>(login.this) {
            public void handleResponse(BackendlessUser backendlessUser) {
                super.handleResponse(backendlessUser);
                startActivity(new Intent(login.this, Volunteer.class));
                finish();

            }});}
        else if(first=='s'){

            Backendless.UserService.login(identity, password,new DefaultCallback<BackendlessUser>(login.this) {
                public void handleResponse(BackendlessUser backendlessUser) {
                    super.handleResponse(backendlessUser);
                    startActivity(new Intent(login.this, Student.class));
                    finish();
                }});}
        else if(first=='a'){

            Backendless.UserService.login(identity, password,new DefaultCallback<BackendlessUser>(login.this) {
                public void handleResponse(BackendlessUser backendlessUser) {
                    super.handleResponse(backendlessUser);
                    startActivity(new Intent(login.this, Admin.class));
                    finish();
                }});}


        else{
                Toast.makeText(login.this,"Invalid Username or Password", Toast.LENGTH_LONG).show();
            }
    }



    @Override
    public void onBackPressed() {
        Intent intent = new Intent(login.this,home.class);
        startActivity(intent);

    }





}


