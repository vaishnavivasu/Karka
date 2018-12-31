package com.example.user.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuesOneActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_one);
        b1 = findViewById(R.id.testComplete);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });
    }

    private void openSignUp() {
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
    }
}
