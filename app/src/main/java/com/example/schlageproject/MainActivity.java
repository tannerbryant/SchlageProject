package com.example.schlageproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textViewAppName;
    EditText editTextUsername, editTextPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        textViewAppName = (TextView) findViewById(R.id.textViewAppName);
        buttonLogin = (Button) findViewById(R.id.login_button);
        editTextUsername = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextPassword = (EditText) findViewById(R.id.editTextTextPassword);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    public void login() {
        // Check username and password for login here.
        // Will call whatever Tanner makes for login.
        String testUsername = "Joe Bills";
        String testPassword = "12345";
        if(editTextUsername.getText().toString().equals(testUsername.toString()) &&
                editTextPassword.getText().toString().equals(testPassword.toString())) {
            // Change view to account_lock_list_page
            Toast.makeText(getApplicationContext(), "Passed Login", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.account_lock_list_page);
        }
        else {
            Toast.makeText(getApplicationContext(), "Failed Login", Toast.LENGTH_SHORT).show();
            editTextUsername.setText("");
            editTextPassword.setText("");
        }
    }
}