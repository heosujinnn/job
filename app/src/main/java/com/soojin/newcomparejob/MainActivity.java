package com.soojin.newcomparejob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    UserDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db= Room.databaseBuilder(getApplicationContext(),UserDatabase.class,"job").allowMainThreadQueries().build();

        Button currentJobBtn = findViewById(R.id.current_job_btn);
        Button addOfferBtn = findViewById(R.id.add_offer_btn);
        Button adjustWeightBtn = findViewById(R.id.adjust_weights_btn);
        Button compareJobsBtn = findViewById(R.id.compare_jobs_btn);

        currentJobBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, CurrentActivity.class);
                startActivity(intent);
            }
        });
        addOfferBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, OfferActivity.class);
                startActivity(intent);
            }
        });
        adjustWeightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, adjustWeight.class);
                startActivity(intent);
            }
        });
        compareJobsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CompareJob.class);
                startActivity(intent);
            }
        });


    }
}