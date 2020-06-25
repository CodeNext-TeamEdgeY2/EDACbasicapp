package com.example.edacbasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView nameTextView;
    TextView cityTextView;
    EditText emailEditText;
    EditText ageEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        nameTextView = findViewById(R.id.userName);
        cityTextView = findViewById(R.id.userCity);
        emailEditText = findViewById(R.id.userEmail);
        ageEditText = findViewById(R.id.userAge);
    }

    public void openFormPage(View view) {
        Intent myIntent = new Intent(ProfileActivity.this, FormActivity.class);
        startActivity(myIntent);
    }

    public void openProfilePage(View view) {
        Intent myIntent = new Intent(ProfileActivity.this, ProfileActivity.class);
        startActivity(myIntent);
    }

    public void openListPage(View view) {
        Intent myIntent = new Intent(ProfileActivity.this, ListActivity.class);
        startActivity(myIntent);
    }

    public void openFoundersPage(View view) {
        Intent myIntent = new Intent(ProfileActivity.this, FoundersActivity.class);
        startActivity(myIntent);
    }
}
