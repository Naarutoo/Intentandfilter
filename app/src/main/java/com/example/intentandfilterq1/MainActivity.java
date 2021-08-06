package com.example.intentandfilterq1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText mEtName, mEtLastName,mEtPassword;
Button mBtnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// ActionBar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");
         initview();

    }

    private void initview() {
    mEtName = findViewById(R.id.etName);
    mEtLastName = findViewById(R.id.etLastName);
    mEtPassword = findViewById(R.id.etPassword);
    mBtnNext = findViewById(R.id.btnNext);

    mBtnNext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("name",mEtName.getText().toString());
            intent.putExtra("lastname",mEtLastName.getText().toString());
            intent.putExtra("password",mEtPassword.getText().toString());
            startActivity(intent);
        }
    });
    }
}


//intent.putExtra("username",mEtuseranme.getText().toString());
