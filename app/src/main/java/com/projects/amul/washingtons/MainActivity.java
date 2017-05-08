package com.projects.amul.washingtons;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentManager fragmentManager = getSupportFragmentManager();
        final BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navbar);


        bottomNavigationView.getMenu().getItem(0).setChecked(true);

        // define your fragments here
        final Fragment washerFragment = new WasherFragment();
        final Fragment dryerFragment = new DryerFragment();
        final Fragment otherFragment = new OtherFragment();

        fragmentManager
                .beginTransaction()
                .replace(R.id.mainFrame, washerFragment)
                .commit();


        // handle navigation selection
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    FragmentTransaction fragmentTransaction;

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_washer:
                                bottomNavigationView.getMenu().getItem(0);
                                fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.mainFrame, washerFragment).commit();
                                return true;
                            case R.id.menu_dryer:
                                bottomNavigationView.getMenu().getItem(1);
                                fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.mainFrame, dryerFragment).commit();
                                return true;
                            case R.id.menu_home:
                                bottomNavigationView.getMenu().getItem(2);
                                fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.mainFrame, otherFragment).commit();
                                return true;
                        }
                        return false;
                    }
                });
    }
}
