package com.example.s_together.togetherclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.s_together.R;

public class Bigdata extends Fragment {
    int i = 0;
    ImageView imageView2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bigdata, container, false);
        imageView2=v.findViewById(R.id.data);

        imageView2.setImageResource(R.drawable.data1);
        imageView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                i = 1 - i;
                if ( i == 0 ){
                    imageView2.setImageResource(R.drawable.data1);
                }
                else{
                    imageView2.setImageResource(R.drawable.data2);
                }

            }
        });
        return v;
    }
}
