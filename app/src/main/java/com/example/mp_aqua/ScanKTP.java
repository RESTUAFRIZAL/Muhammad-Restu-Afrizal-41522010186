package com.example.mp_aqua;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.activity.EdgeToEdge;
import android.graphics.Matrix;



public class ScanKTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scan_ktp);
    }

    public void back_extravaganza(View view) {
        Intent back_extravaganza = new Intent(ScanKTP.this, ExtraVaganza.class);
        startActivity(back_extravaganza);
    }

}