package com.example.fanwenbo.kj;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

import com.viewpagerindicator.TabPageIndicator;

import java.util.List;

public class MainActivity extends FragmentActivity {

    private ViewPager mViewPager;
    private TabPageIndicator mTabPageIndicator;
    private TabAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        initView();

    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
        mTabPageIndicator = (TabPageIndicator) findViewById(R.id.id_indicator);
        mAdapter = new TabAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mTabPageIndicator.setViewPager(mViewPager, 0);
    }




    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_item1:
                Toast.makeText(this, "编辑", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_item2:
                Toast.makeText(this, "属性", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}

