package com.example.edacbasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FormActivity extends AppCompatActivity {
    FirebaseDatabase fdatabase;
    DatabaseReference rdatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        fdatabase = FirebaseDatabase.getInstance();
        rdatabase = fdatabase.getReference();
    }
    public void openFormPage(View view) {
        Intent myIntent = new Intent(FormActivity.this, FormActivity.class);
        startActivity(myIntent);
    }

    public void openProfilePage(View view) {
        Intent myIntent = new Intent(FormActivity.this, ProfileActivity.class);
        startActivity(myIntent);
    }

    public void openListPage(View view) {
        Intent myIntent = new Intent(FormActivity.this, ListActivity.class);
        startActivity(myIntent);
    }

    public void openFoundersPage(View view) {
        Intent myIntent = new Intent(FormActivity.this, FoundersActivity.class);
        startActivity(myIntent);
    }
}

