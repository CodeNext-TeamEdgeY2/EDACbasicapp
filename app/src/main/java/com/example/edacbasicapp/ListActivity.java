package com.example.edacbasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void openFormPage(View view) {
        Intent myIntent = new Intent(ListActivity.this, FormActivity.class);
        startActivity(myIntent);
    }

    public void openProfilePage(View view) {
        Intent myIntent = new Intent(ListActivity.this, ProfileActivity.class);
        startActivity(myIntent);
    }

    public void openListPage(View view) {
        Intent myIntent = new Intent(ListActivity.this, ListActivity.class);
        startActivity(myIntent);
    }

    public void openFoundersPage(View view) {
        Intent myIntent = new Intent(ListActivity.this, FoundersActivity.class);
        startActivity(myIntent);
    }
}
