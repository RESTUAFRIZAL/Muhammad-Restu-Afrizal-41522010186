package com.example.mp_aqua;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;


public class ScanTutupBotol extends AppCompatActivity {

//    Button btn_scan;
//    Button btn_copy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scan_tutup_botol);
//        btn_scan = findViewById(R.id.btn_scan);
//        btn_copy = findViewById(R.id.btn_copy);
//        btn_copy.setOnClickListener(v->{
//            copyToClipboard(btn_copy.getText().toString());
//        });
//        btn_scan.setOnClickListener(v->{
//            scanCode();
//        });
    }

//    private void scanCode() {
//        ScanOptions options = new ScanOptions();
//        options.setPrompt("Volunm up to flash on");
//        options.setBeepEnabled(true);
//        options.setOrientationLocked(true);
//        options.setCaptureActivity(CaptureAct.class);
//        Launcher.launch(options);
//    }
//    ActivityResultLauncher<ScanOptions> Launcher = registerForActivityResult(new ScanContract(), result ->{
//        if(result.getContents() !=null){
//            btn_copy.setText(result.getContents());
//        }
//    });
//
//    private void copyToClipboard(String text) {
//        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
//        ClipData clip = ClipData.newPlainText("scanned_result", text);
//        clipboard.setPrimaryClip(clip);
//        Toast.makeText(this, "Copied to clipboard", Toast.LENGTH_SHORT).show();
//    }
//    public void scan_ktp(View view) {
//        Intent scan_ktp = new Intent(ScanTutupBotol.this, ScanKTP.class);
//        startActivity(scan_ktp);
//    }
    public void back_home(View view) {
        Intent back_home = new Intent(ScanTutupBotol.this, HomePage.class);
        startActivity(back_home);
    }

}
