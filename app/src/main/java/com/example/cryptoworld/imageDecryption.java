package com.example.cryptoworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class imageDecryption extends AppCompatActivity {
    Button  decrypt;
    String image;
    ClipboardManager clipboardManager;
    ImageView imgView;
    EditText encImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_decryption);
        decrypt = findViewById(R.id.idecrypt);
        encImg = findViewById(R.id.enc_text);
        encImg.setEnabled(true);
        imgView = findViewById(R.id.imgView);
        clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);


        decrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byte[] bytes = Base64.decode(encImg.getText().toString(), Base64.DEFAULT);
                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                imgView.setImageBitmap(bitmap);
            }
        });
    }
}