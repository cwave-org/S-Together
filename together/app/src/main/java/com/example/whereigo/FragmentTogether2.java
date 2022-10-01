package com.example.whereigo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.whereigo.togetherclick.Bigdata;
import com.example.whereigo.togetherclick.Calculator;
import com.example.whereigo.togetherclick.Calender;
import com.example.whereigo.togetherclick.Map;
import com.example.whereigo.togetherclick.together_Adapter;
import com.google.android.material.tabs.TabLayout;

public class FragmentTogether2 extends Fragment implements View.OnClickListener {
    MainActivity activity;
    together_Adapter adapter;
    TabLayout tabLayout;
    ViewPager viewPager;

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //현재 소속된 액티비티를 메인 액티비티로 한다.
        activity = (MainActivity) getActivity();
    }
    @Override public void onDetach() {
        super.onDetach();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_together2,container,false);
        tabLayout=v.findViewById(R.id.tabs);
        viewPager=v.findViewById(R.id.view_pager);
        adapter=new together_Adapter(activity.getSupportFragmentManager(),1);


        //FragmentAdapter에 컬렉션 담기
        adapter.addFragment(new Calculator());
        adapter.addFragment(new Calender());
        adapter.addFragment(new Map());
        adapter.addFragment(new Bigdata());

        //ViewPager Fragment 연결
        viewPager.setAdapter(adapter);

        //ViewPager과 TabLayout 연결
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("정산");
        tabLayout.getTabAt(1).setText("캘린더");
        tabLayout.getTabAt(2).setText("지도");
        tabLayout.getTabAt(3).setText("지출분석");

        tabLayout.setTabTextColors(Color.rgb(103,103,103),Color.rgb(0,0,0));
        return v;
    }
    @SuppressLint("ResourceType")
    @Override
    public void onClick(View v) {

    }
}
