package io.naotou.appmarket.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.naotou.appmarket.R;
import io.naotou.appmarket.base.BaseActivity;
import io.naotou.appmarket.fragment.FragmentFactory;
import io.naotou.appmarket.ui.widget.PagerTab;


public class MainActivity extends BaseActivity {


    private PagerTab pagerTab;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initView() {

        setContentView(R.layout.activity_main);
        //初始化
        viewPager = (ViewPager) findViewById(R.id.pager);
        pagerTab = (PagerTab) findViewById(R.id.tabs);
    }

    @Override
    protected void initActionBar() {

    }
    private class ViewPagerAdapter extends FragmentStatePagerAdapter{

        public ViewPagerAdapter(FragmentManager fm) {

            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return FragmentFactory.createFragment(position);
        }

        @Override
        public int getCount() {

            return 0;
        }
    }
}
