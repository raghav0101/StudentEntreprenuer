package com.example.vedantmehra.homepage2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class profile_student_edit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_student_edit);
        Intent intent = getIntent();
        String textview3 = intent.getStringExtra("textView3");
        String textview4 = intent.getStringExtra("textView4");
        String textview6 = intent.getStringExtra("textView6");
        String textview8 = intent.getStringExtra("textView8");
        String textview10 = intent.getStringExtra("textView10");
        String textview12 = intent.getStringExtra("textView12");
        String textview14 = intent.getStringExtra("textView14");
        EditText textveiw = (EditText) findViewById(R.id.textView3);
        textveiw.setText(textview3);
        EditText textveiw2 = (EditText) findViewById(R.id.textView4);
        textveiw2.setText(textview4);
        EditText textveiw3 = (EditText) findViewById(R.id.textView6);
        textveiw3.setText(textview6);
        EditText textveiw4 = (EditText) findViewById(R.id.textView8);
        textveiw4.setText(textview8);
        EditText textveiw5 = (EditText) findViewById(R.id.textView10);
        textveiw5.setText(textview10);
        EditText textveiw6 = (EditText) findViewById(R.id.textView12);
        textveiw6.setText(textview12);
        EditText textveiw7 = (EditText) findViewById(R.id.textView14);
        textveiw7.setText(textview14);
    }
    public void saveit(View view)
    {
        Intent goBack = new Intent();
        EditText etLocation = (EditText) findViewById(R.id.textView3);
        EditText etLocation1 = (EditText) findViewById(R.id.textView4);
        EditText etLocation2 = (EditText) findViewById(R.id.textView6);
        EditText etLocation3 = (EditText) findViewById(R.id.textView8);
        EditText etLocation4 = (EditText) findViewById(R.id.textView10);
        EditText etLocation5 = (EditText) findViewById(R.id.textView12);
        EditText etLocation6 = (EditText) findViewById(R.id.textView14);
        goBack.putExtra("location", etLocation.getText().toString());
        goBack.putExtra("location1", etLocation1.getText().toString());
        goBack.putExtra("location2", etLocation2.getText().toString());
        goBack.putExtra("location3", etLocation3.getText().toString());
        goBack.putExtra("location4", etLocation4.getText().toString());
        goBack.putExtra("location5", etLocation5.getText().toString());
        goBack.putExtra("location6", etLocation6.getText().toString());
        setResult(RESULT_OK,goBack);
        finish();
    }
    }