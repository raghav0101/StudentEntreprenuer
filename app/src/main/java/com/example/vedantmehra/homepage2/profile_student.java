package com.example.vedantmehra.homepage2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class profile_student extends AppCompatActivity {
    Button bt;
    Button btw;
    Button btww;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_student);
        bt = findViewById(R.id.button);
        btw = findViewById(R.id.button2);
        btw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte=new Intent(getApplicationContext(),idea.class);
                startActivity(inte);
            }
        });
        btww = findViewById(R.id.button3);
        btww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt = new Intent(getApplicationContext(),changepassword.class);
                startActivity(intt);
            }
        });
    }
    public void goEdit(View view)
    {
        Intent intent = new Intent(this , profile_student_edit.class);
        TextView et_Location = (TextView) findViewById(R.id.textView3);
        TextView et_Location1 = (TextView) findViewById(R.id.textView4);
        TextView et_Location2 = (TextView) findViewById(R.id.textView6);
        TextView et_Location3 = (TextView) findViewById(R.id.textView8);
        TextView et_Location4 = (TextView) findViewById(R.id.textView10);
        TextView et_Location5 = (TextView) findViewById(R.id.textView12);
        TextView et_Location6 = (TextView) findViewById(R.id.textView14);
        intent.putExtra("textView3",et_Location.getText().toString());
        intent.putExtra("textView4",et_Location1.getText().toString());
        intent.putExtra("textView6",et_Location2.getText().toString());
        intent.putExtra("textView8",et_Location3.getText().toString());
        intent.putExtra("textView10",et_Location4.getText().toString());
        intent.putExtra("textView12",et_Location5.getText().toString());
        intent.putExtra("textView14",et_Location6.getText().toString());
        startActivityForResult(intent, 123);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 123){
            String heading = data.getStringExtra("location");
            String bod = data.getStringExtra("location1");
            String bod1 = data.getStringExtra("location2");
            String bod2 = data.getStringExtra("location3");
            String bod3 = data.getStringExtra("location4");
            String bod4 = data.getStringExtra("location5");
            String bod5 = data.getStringExtra("location6");
            TextView textveiw = (TextView) findViewById(R.id.textView3);
            textveiw.setText(heading);
            TextView textveiw2 = (TextView) findViewById(R.id.textView4);
            textveiw2.setText(bod);
            TextView textveiw3 = (TextView) findViewById(R.id.textView6);
            textveiw3.setText(bod1);
            TextView textveiw4 = (TextView) findViewById(R.id.textView8);
            textveiw4.setText(bod2);
            TextView textveiw5 = (TextView) findViewById(R.id.textView10);
            textveiw5.setText(bod3);
            TextView textveiw6 = (TextView) findViewById(R.id.textView12);
            textveiw6.setText(bod4);
            TextView textveiw7 = (TextView) findViewById(R.id.textView14);
            textveiw7.setText(bod5);
        }
    }
}
