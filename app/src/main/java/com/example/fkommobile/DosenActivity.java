package com.example.fkommobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen);
    }

    public void backdosen(View view) {
        super.onBackPressed();
//        Intent moveBackDosen = new Intent (DosenActivity. this, HomeActivity.class);
//        startActivity(moveBackDosen);
    }
}
