package com.example.daltonapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class viewImage extends AppCompatActivity {
    Button mButton;
    ImageView myImage;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);
        mButton = findViewById(R.id.button3);
        myImage = findViewById(R.id.imageView2);

        File imgFile = new  File("/storage/emulated/0/Pictures/rendered.jpg");
        if(imgFile.exists()){

            Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
            myImage.setImageBitmap(myBitmap);
        };

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                myImage.setRotation(90*counter);
            }
        });
    }
}
