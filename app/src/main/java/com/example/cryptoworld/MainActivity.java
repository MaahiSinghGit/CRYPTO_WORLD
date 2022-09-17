package com.example.cryptoworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private Button txt;
    private Button img;
    ViewFlipper vf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.text);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Text.class);
                startActivity(intent);
            }
        });
        img=findViewById(R.id.image);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Image.class);
                startActivity(intent);
            }
        });

        vf=findViewById(R.id.vf);
        int images[]={R.drawable.flipfive,R.drawable.flipone,R.drawable.fliptwo,R.drawable.flipthree,R.drawable.flipfour};
        for(int i=0;i<images.length;i++){
            flipper(images[i]);
        }
    }

    public void flipper(int image) {
        ImageView test=new ImageView(this);
        test.setBackgroundResource(image);
        vf.addView(test);
        vf.setFlipInterval(3000);
        vf.setAutoStart(true);
        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}