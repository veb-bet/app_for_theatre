package com.example.application_of_theatre;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TheatreActivity extends Activity {
    private Button logoutBtn;
    private Button inprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatre);

        logoutBtn = (Button) findViewById(R.id.button2);
        inprofile = (Button) findViewById(R.id.button);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logoutIntent = new Intent(TheatreActivity.this, MainActivity.class);
                startActivity(logoutIntent);
            }
        });
        inprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inprIntent = new Intent(TheatreActivity.this, ProfileActivity.class);
                startActivity(inprIntent);
            }
        });

    }
}