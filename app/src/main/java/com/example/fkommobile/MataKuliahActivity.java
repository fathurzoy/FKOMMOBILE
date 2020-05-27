package com.example.fkommobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MataKuliahActivity extends AppCompatActivity {
    private boolean table_flg = false;
    private Button switchBtn;
    private Button switchBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mata_kuliah);

        switchBtn = findViewById(R.id.switchBtn);
        switchBtn2 = findViewById(R.id.switchBtn2);
        switchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TableLayout table = findViewById(R.id.table);

//            setColumnCollapse(int column, boolean isColapse)
                table.setColumnCollapsed(1, table_flg);
                table.setColumnCollapsed(2, table_flg);

                if (table_flg) {
                    // close
                    table_flg = false;
                    switchBtn.setText("Show Detail");
                } else {
                    // open
                    table_flg = true;
                    switchBtn.setText("Hide Detail");
                }
            }
        });

        switchBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TableLayout table2 = findViewById(R.id.table2);

//            setColumnCollapse(int column, boolean isColapse)
                table2.setColumnCollapsed(1, table_flg);
                table2.setColumnCollapsed(2, table_flg);

                if (table_flg) {
                    // close
                    table_flg = false;
                    switchBtn2.setText("Show Detail");
                } else {
                    // open
                    table_flg = true;
                    switchBtn2.setText("Hide Detail");
                }
            }
        });
    }

    public void backmatkul(View view) {
        super.onBackPressed();
//        Intent moveBackMatkul = new Intent (MataKuliahActivity. this, HomeActivity.class);
//        startActivity(moveBackMatkul);
    }
}
