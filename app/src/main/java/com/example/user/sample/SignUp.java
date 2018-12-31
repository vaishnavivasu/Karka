package com.example.user.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.sample.StudentDetails;

public class SignUp extends AppCompatActivity {
    Button b1;
    EditText e1,e2, e3, e4, e5;
    StudentDetails sd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        b1 = findViewById(R.id.button);
        e1 = findViewById(R.id.editText8);
        e2 = findViewById(R.id.editText9);
        e3 = findViewById(R.id.editText10);
        e4 = findViewById(R.id.editText11);
        e5 = findViewById(R.id.editText12);
        sd = new StudentDetails();
        final String nme = e1.getText().toString();
        final String DOB = e3.getText().toString();
        final int current = 1;
        final int new_old = 1;
        final String city = e4.getText().toString();
        final String school = e5.getText().toString();
        final String e_mail = e2.getText().toString();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sd.setNme(nme);
                sd.setDOB(DOB);
                sd.setE_mail(e_mail);
                sd.setCity(city);
                sd.setSchool(school);
                sd.setCurrent(current);
                sd.setNew_old(new_old);
                Intent intent = new Intent(SignUp.this, MainNavigation.class);
                startActivity(intent);
            }
        });
    }
}
