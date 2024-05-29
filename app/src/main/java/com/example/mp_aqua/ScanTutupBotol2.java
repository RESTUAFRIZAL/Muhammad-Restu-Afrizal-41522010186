package com.example.mp_aqua;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.Intent;

public class ScanTutupBotol2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scan_tutup_botol2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void scan_ktp(View view) {
        Intent scan_ktp = new Intent(ScanTutupBotol2.this, ScanKTP.class);
        startActivity(scan_ktp);
    }

    public void back_scan(View view) {
        Intent back_scan = new Intent(ScanTutupBotol2.this, ScanTutupBotol.class);
        startActivity(back_scan);
    }
}