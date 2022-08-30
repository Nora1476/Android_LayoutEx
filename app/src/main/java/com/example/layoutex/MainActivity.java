package com.example.layoutex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnConfirm = findViewById(R.id.confirm);
        Button btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "방가", Toast.LENGTH_SHORT).show();
            }
        });
        btnConfirm.setOnClickListener(view -> {
            Log.d(">>>", "My log");
            Intent intent = new Intent(this, LinearActivity.class);
            startActivity(intent);
//            finish();
        });
    }
}