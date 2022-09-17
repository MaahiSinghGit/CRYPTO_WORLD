package com.example.cryptoworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Image extends AppCompatActivity {
    private Button ienc;
    private Button idec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ienc=findViewById(R.id.iencr);
        idec=findViewById(R.id.idecr);
        ienc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Image.this,imageEncryption.class);
                startActivity(intent);

            }
        });
        idec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Image.this,imageDecryption.class);
                startActivity(intent);
            }
        });
    }
}