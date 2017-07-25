package com.projects.amul.washingtons;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //adapter for the viewpager
    public static class PagerAdapter extends FragmentPagerAdapter{
        private static int NUM_ITEMS = 3;
        public PagerAdapter (FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return WasherFragment.newInstance();
                case 1:
                    return DryerFragment.newInstance();
                case 2:
                    return OtherFragment.newInstance();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }
    }

    //instance of the adapter
    FragmentPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up viewpager, and attach adapter
        final ViewPager vPager = (ViewPager) findViewById(R.id.mainFrame);
        viewPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        vPager.setAdapter(viewPagerAdapter);

        //initialize bottom nav bar
        final BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navbar);

        bottomNavigationView.getMenu().getItem(0).setChecked(true);

        //set a page change listener to viewpager
        vPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            // This method will be invoked when a new page becomes selected.
            @Override
            public void onPageSelected(int position) {
                bottomNavigationView.getMenu().getItem(position).setChecked(true);            }

            // This method will be invoked when the current page is scrolled
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                bottomNavigationView.getMenu().getItem(position).setChecked(true);            }

            // Called when the scroll state changes:
            // SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING, SCROLL_STATE_SETTLING
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        // handles nav bar selection
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {

                    //switch cases to set correct page
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_washer:
                                bottomNavigationView.getMenu().getItem(0);
                                vPager.setCurrentItem(0);
                                return true;
                            case R.id.menu_dryer:
                                bottomNavigationView.getMenu().getItem(1);
                                vPager.setCurrentItem(1);
                                return true;
                            case R.id.menu_home:
                                bottomNavigationView.getMenu().getItem(2);
                                vPager.setCurrentItem(2);
                                return true;
                        }
                        return false;
                    }
                });
    }
}
