package com.example.s_together.togetherclick;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
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

import com.example.s_together.MainActivity;
import com.example.s_together.R;
import com.example.s_together.Receipt;

public class Calculator extends Fragment {
    int i = 0;
    ImageView imageView,imageView2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.calculator,container,false);

        imageView=v.findViewById(R.id.notouch);
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

        imageView2=v.findViewById(R.id.top);
        imageView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Receipt.class);
                startActivity(intent);

            }
        });

        return v;
    }

}
