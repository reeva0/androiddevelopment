package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    EditText emailInput;
    EditText passwordInput;
    Spinner genderSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning views to our variables
        myButton = findViewById(R.id.submit_button);
        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        genderSpinner = findViewById(R.id.gender_spinner);

        // Making button clickable
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Fetching the values
                String email = emailInput.getText().toString();
                String password = passwordInput.getText().toString();
                String gender = genderSpinner.getSelectedItem().toString();

                // Navigation action
                Intent myIntent = new Intent(MainActivity.this, SecondScreen.class);
                myIntent.putExtra("email", email);
                myIntent.putExtra("password", password);
                myIntent.putExtra("gender", gender);
                startActivity(myIntent);
            }
        });
    }
}
