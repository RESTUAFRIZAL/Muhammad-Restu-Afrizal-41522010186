package com.example.mp_aqua;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;

public class RedeemVaganza2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_redeem_vaganza2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void redeemvaganza2(View view) {
        Intent redeemvaganza2 = new Intent(RedeemVaganza2.this, RedeemVaganza.class);
        startActivity(redeemvaganza2);
    }

    public void back_home_redeemvaganza2(View view) {
        Intent back_home_redeemvaganza2 = new Intent(RedeemVaganza2.this, HomePage.class);
        startActivity(back_home_redeemvaganza2);
    }
}