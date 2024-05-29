package com.example.mp_aqua;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.view.View;
import android.content.Intent;

import com.google.android.material.navigation.NavigationView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button btn_side_bar = findViewById(R.id.btn_side_bar);

        btn_side_bar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer();
            }
        });
    }
    private void openDrawer() {
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.hal_view);
        drawerLayout.openDrawer(GravityCompat.END);
    }

    public void redeemvaganza(View view) {
        Intent redeemvaganza = new Intent(HomePage.this, RedeemVaganza2.class);
        startActivity(redeemvaganza);
    }

    public void extravaganza(View view) {
        Intent extravaganza = new Intent(HomePage.this, SelamatUndian.class);
        startActivity(extravaganza);
    }

    public void scanbarcode(View view) {
        Intent scanbarcode = new Intent(HomePage.this, ScanTutupBotol.class);
        startActivity(scanbarcode);
    }

}