package com.example.fanwenbo.kj;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by fanwenbo on 17-9-8.
 */

public class TabAdapter extends FragmentPagerAdapter {

    public static String[]TITLES = new String[]{"热门","科技","娱乐","其他"};
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        TabFragment fragment = new TabFragment(position);
        return fragment;
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }
}
