package com.example.mp_aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class ExtraVaganza extends AppCompatActivity {

    private ImageView img_spin;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_extra_vaganza);

        img_spin = findViewById(R.id.img_spin);
        random = new Random();

        ImageView img_spin = findViewById(R.id.img_spin);
        img_spin.setOnClickListener(v -> spinWheel());
    }

    private void spinWheel() {
        // Sudut awal acak antara 0 hingga 360 derajat
        float startAngle = random.nextFloat() * 360;
        // Sudut akhir acak untuk memberikan hasil yang berbeda setiap kali
        float endAngle = startAngle + 360f * 5 + random.nextInt(360);

        // Definisikan animasi rotasi
        RotateAnimation rotate = new RotateAnimation(0, endAngle,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(3000); // durasi dalam milidetik
        rotate.setInterpolator(new LinearInterpolator()); // menjaga kecepatan tetap konstan
        rotate.setFillAfter(true); // Setelah animasi selesai, roda akan tetap pada posisi terakhir

        // Mulai animasi
        img_spin.startAnimation(rotate);

    }

    public void scan_ktp(View view) {
        Intent scan_ktp = new Intent(ExtraVaganza.this, ScanKTP.class);
        startActivity(scan_ktp);
    }

    public void back_home_extravaganza(View view) {
        Intent back_home_extravaganza = new Intent(ExtraVaganza.this, HomePage.class);
        startActivity(back_home_extravaganza);
    }
}