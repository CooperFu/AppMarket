package io.naotou.appmarket.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Jack_Cooper on 2014/11/20, 15:35.
 * Have a nice day!
 */
public abstract class BaseActivity extends Activity {
    /**
     * @param savedInstanceState
     * 定义一个activity的基类. 让每个activity都继承这个类.
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        init();
        initView();
        initActionBar();
    }
    protected abstract void init();
    protected abstract void initView();
    protected abstract void initActionBar();
}
