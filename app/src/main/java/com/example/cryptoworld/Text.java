package com.example.cryptoworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Text extends AppCompatActivity {

    private Button enc;
    private  Button dec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        enc=findViewById(R.id.encr);
        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Text.this,Encrypt.class);
                startActivity(intent);
            }
        });
        dec=findViewById(R.id.decr);
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Text.this,Decryption.class);
                startActivity(intent);
            }
        });
    }
}