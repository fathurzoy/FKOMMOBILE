package com.example.fkommobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MahasiswaActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);
    }

    public void backmahasiswa(View view) {
        super.onBackPressed();
//        Intent moveBackMahasiswa = new Intent (MahasiswaActivity. this, HomeActivity.class);
//        startActivity(moveBackMahasiswa);
    }
}
