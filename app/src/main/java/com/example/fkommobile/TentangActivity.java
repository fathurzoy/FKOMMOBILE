package com.example.fkommobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TentangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
    }

    public void backinfo(View view) {
        super.onBackPressed();
//        Intent moveBackInfo = new Intent (TentangActivity. this, HomeActivity.class);
//        startActivity(moveBackInfo);
    }
}
