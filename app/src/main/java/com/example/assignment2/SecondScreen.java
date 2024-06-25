package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondScreen extends AppCompatActivity {

    TextView emailTextView;
    TextView passwordTextView;
    TextView genderTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        // Getting data from Intent
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String gender = intent.getStringExtra("gender");

        // Linking TextViews with their IDs
        emailTextView = findViewById(R.id.email_display);
        passwordTextView = findViewById(R.id.password_display);
        genderTextView = findViewById(R.id.gender_display);

        // Displaying the values
        emailTextView.setText("Email: " + email);
        passwordTextView.setText("Password: " + password);
        genderTextView.setText("Gender: " + gender);
    }
}
