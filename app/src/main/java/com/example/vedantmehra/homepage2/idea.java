package com.example.vedantmehra.homepage2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class idea extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;


    private static final int REQ_CODE = 1234;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String title,body;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea);




        NavigationView nav_view = (NavigationView)findViewById(R.id.navView);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                // Intent intent = new Intent(HomePage.this, NewPage.class);

                if(id == R.id.myprof){
                    Toast.makeText(idea.this, "My Profile", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(idea.this, profile_student.class);
                    startActivity(intent);

                }else if(id == R.id.relat){
                    Toast.makeText(idea.this, "My Relations", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(idea.this, relation.class);
                    startActivity(intent);

                }else if(id == R.id.idea){
                    Toast.makeText(idea.this, "My Idea", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(idea.this, idea.class);
                    startActivity(intent);

                }else if(id == R.id.logout){
                    Toast.makeText(idea.this, "Log Out", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(idea.this,MainActivity.class);
                    FirebaseAuth firebaseAuth;
                    firebaseAuth = FirebaseAuth.getInstance();
                    firebaseAuth.signOut();

                    // Kevin update the new page for the login page
                    startActivity(intent1);
                    finish();

                }else if(id == R.id.notif){
                    Toast.makeText(idea.this, "Notification Page", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(idea.this, notification.class);
                    startActivity(intent);

                }
                return true;
            }
        });
    }
    public void editPage(View view){
        Intent intent = new Intent(this , dummypage.class);
        TextView et_Location = (TextView) findViewById(R.id.title);
        TextView et_Location1 = (TextView) findViewById(R.id.body);
        TextView et_Location2 = (TextView) findViewById(R.id.Cost);
        TextView et_Location3 = (TextView) findViewById(R.id.WorkType);
        TextView et_Location4 = (TextView) findViewById(R.id.Time);
        intent.putExtra("title",et_Location.getText().toString());
        intent.putExtra("body",et_Location1.getText().toString());
        intent.putExtra("Cost",et_Location2.getText().toString());
        intent.putExtra("WorkType",et_Location3.getText().toString());
        intent.putExtra("Time",et_Location4.getText().toString());
        startActivityForResult(intent, REQ_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_CODE){
            String heading = data.getStringExtra("location");
            String bod = data.getStringExtra("location1");
            String bod1 = data.getStringExtra("location2");
            String bod2 = data.getStringExtra("location3");
            String bod3 = data.getStringExtra("location4");
            TextView textveiw = (TextView) findViewById(R.id.title);
            textveiw.setText(heading);
            TextView textveiw2 = (TextView) findViewById(R.id.body);
            textveiw2.setText(bod);
            TextView textveiw3 = (TextView) findViewById(R.id.Cost);
            textveiw3.setText(bod1);
            TextView textveiw4 = (TextView) findViewById(R.id.WorkType);
            textveiw4.setText(bod2);
            TextView textveiw5 = (TextView) findViewById(R.id.Time);
            textveiw5.setText(bod3);
        }
    }
}
