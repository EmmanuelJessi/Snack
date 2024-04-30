package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = findViewById(R.id.mainLayout);

        Button btn = findViewById(R.id.btnID);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mainLayout, "Bottom Alert Dialog",Snackbar.LENGTH_LONG).setAction("Close", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "Bottom Button Clicked", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.red))              .setBackgroundTint(getResources().getColor(R.color.white))
                        .setTextColor(getResources().getColor(R.color.black))
                        .show();
            }
        });
    }
}
