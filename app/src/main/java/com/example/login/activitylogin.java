package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activitylogin extends AppCompatActivity {

    private Button button;
            TextView forgot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        forgot = findViewById(R.id.forgot_password);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activitylogin.this, Guest.class);
                startActivity(intent);

            }
        });

    }

    public void forgot(View v) {
        Intent intent = new Intent(activitylogin.this, forgot_password.class);
        startActivity(intent);


    }

}
