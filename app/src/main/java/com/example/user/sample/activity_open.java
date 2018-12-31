package com.example.user.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_open extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        b1 = findViewById(R.id.open_button);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openTest();
            }
        });
    }

    private void openTest() {
        Intent intent = new Intent(this,QuesOneActivity.class);
        startActivity(intent);
    }
}
