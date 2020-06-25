package com.example.edacbasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FormActivity extends AppCompatActivity {
    FirebaseDatabase fdatabase;
    DatabaseReference rdatabase;
    EditText userInfo1;
    EditText userInfo2;
    ArrayList<String> compiledInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        fdatabase = FirebaseDatabase.getInstance();
        rdatabase = fdatabase.getReference().child("compiledInfo");
        userInfo1 = findViewById(R.id.nameText);
        userInfo2 = findViewById(R.id.cityText);
        compiledInfo = new ArrayList<String>();

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

    public void sendInfo(View view) {
        String name = String.valueOf(userInfo1.getText());
        String city = String.valueOf(userInfo2.getText());
        String last = (name + " [" + city + "]" );
        compiledInfo.add(last);
        rdatabase.push().setValue(last);

    }
}

