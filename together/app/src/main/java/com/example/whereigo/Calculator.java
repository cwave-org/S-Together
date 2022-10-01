package com.example.whereigo;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    int i = 0;
    ImageView imageView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        imageView=(ImageView)findViewById(R.id.notouch);
        imageView.setImageResource(R.drawable.text);
        imageView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                i = 1 - i;

                if ( i == 0 ){
                    imageView.setImageResource(R.drawable.text);
                }
                else{
                    imageView.setImageResource(R.drawable.text2);
                }

            }
        });
    }
}
