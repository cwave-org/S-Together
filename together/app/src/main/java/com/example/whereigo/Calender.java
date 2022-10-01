package com.example.whereigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calender extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;
    int i = 0;int j = 0;
    ImageView imageView;
    ImageView imageView2;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender);
        textView1=(TextView) findViewById(R.id.top1);
        textView2=(TextView) findViewById(R.id.top2);
        textView3=(TextView) findViewById(R.id.top3);
        textView4=(TextView) findViewById(R.id.top4);
        textView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Calculator.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
                finish();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Calender.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
                finish();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Map.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
                finish();
            }
        });
        textView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Bigdata.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
                finish();
                /*imageView2=(ImageView)findViewById(R.id.data);

                imageView2.setImageResource(R.drawable.data1);
                imageView2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        j = 1 - j;

                        if ( j == 0 ){
                            imageView2.setImageResource(R.drawable.data1);
                        }
                        else{
                            imageView2.setImageResource(R.drawable.data2);
                        }

                    }
                });*/
            }
        });


       /* imageView=(ImageView)findViewById(R.id.notouch);

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
        });*/


    }
}
