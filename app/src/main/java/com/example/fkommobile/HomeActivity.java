package com.example.fkommobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity{
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
//            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    public void btnmatkul(View view) {
        Intent moveMataKuiah = new Intent (HomeActivity. this, MataKuliahActivity.class);
        startActivity(moveMataKuiah);
    }

    public void btnmahasiswa(View view) {
        Intent moveMahasiswa = new Intent (HomeActivity. this, MahasiswaActivity.class);
        startActivity(moveMahasiswa);
    }

    public void btndosen(View view) {
        Intent moveDosen = new Intent (HomeActivity. this, DosenActivity.class);
        startActivity(moveDosen);
    }

    public void btntentang(View view) {
        Intent moveTentang = new Intent (HomeActivity. this, TentangActivity.class);
        startActivity(moveTentang);
    }
    public void web(View view) {
        Intent webIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://fakultaskomputerumht.com"));
        startActivity(webIntent);
    }
}
