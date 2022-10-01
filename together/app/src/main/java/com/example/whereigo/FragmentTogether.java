package com.example.whereigo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FragmentTogether extends Fragment implements View.OnClickListener {
    MainActivity activity;
    private ImageView iv;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //현재 소속된 액티비티를 메인 액티비티로 한다.
        activity = (MainActivity) getActivity();
    }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_together, container, false);
            iv=rootView.findViewById(R.id.start);
            iv.setOnClickListener(this);
            return rootView;
        }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.start:{
                activity.onFragmentChange(1);
            }
        }
        }
}