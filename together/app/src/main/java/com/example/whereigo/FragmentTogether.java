package com.example.whereigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class FragmentTogether extends Fragment {
    private ImageView iv;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_together, container, false);
            ImageView iv=(ImageView) rootView.findViewById(R.id.start);
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), Calculator.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
}