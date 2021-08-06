package com.example.intentandfilterq1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView mTvName,mTvLastname,mTvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
initview();
Intent intent = getIntent();
String name = getIntent().getStringExtra("name");
mTvName.setText(name);
String Lastname = getIntent().getStringExtra("lastname");
mTvLastname.setText(Lastname);
String password = getIntent().getStringExtra("password");
mTvPassword.setText(password);
    }

    private void initview() {
    mTvName = findViewById(R.id.tvName);
    mTvLastname = findViewById(R.id.tvLastName);
    mTvPassword = findViewById(R.id.tvPassword);
    }
}