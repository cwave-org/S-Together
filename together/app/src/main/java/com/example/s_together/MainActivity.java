package com.example.s_together;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public Object onFragmentChange;
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentHome fragmentHome = new FragmentHome();
    private FragmentSearch fragmentSearch = new FragmentSearch();
    private FragmentMypage fragmentMypage = new FragmentMypage();
    private FragmentCardHome fragmentCardHome= new FragmentCardHome();
    private FragmentTogether fragmentTogether= new FragmentTogether();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.menu_frame_layout, fragmentHome).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.menu_bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());

    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (menuItem.getItemId()) {
                case R.id.menu_home:
                    transaction.replace(R.id.menu_frame_layout, fragmentHome).commitAllowingStateLoss();
                    break;
                case R.id.menu_search:
                    transaction.replace(R.id.menu_frame_layout, fragmentSearch).commitAllowingStateLoss();
                    break;
                case R.id.menu_mypage:
                    transaction.replace(R.id.menu_frame_layout, fragmentMypage).commitAllowingStateLoss();
                    break;

                case R.id.menu_cardhome:
                    transaction.replace(R.id.menu_frame_layout, fragmentCardHome).commitAllowingStateLoss();
                    break;

                case R.id.menu_together:
                    transaction.replace(R.id.menu_frame_layout, fragmentTogether).commitAllowingStateLoss();
                    break;

            }

            return true;
        }
    }
    public void onFragmentChange(int fragmentNum) {
        //sell
        if (fragmentNum == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame_layout, new FragmentTogether2()).commit();
        }
    }
}