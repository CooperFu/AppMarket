package io.naotou.appmarket.base;

import android.app.Application;
import android.os.*;
import android.text.AndroidCharacter;

/**
 * Created by Jack_Cooper on 2014/11/20, 15:37.
 * Have a nice day!
 *
 */
public class BaseApplication extends Application {
    //获取到主线程的上下文
    public static BaseApplication mContext;
    //获取到主线程的handler.
    public static  Handler mMainThreadHandler;
    //获取到主线程的looper
    public static Looper mMainThreadLooper;
    //获取到主线程.
    public static Thread mMainThread;

    public static int mMainThreadId;
    @Override
    public void onCreate() {

        super.onCreate();
        this.mContext = this;
        this.mMainThreadHandler = new Handler();
        this.mMainThreadLooper = getMainLooper();
        //当前线程就是主线程
        this.mMainThread = Thread.currentThread();
        this.mMainThreadId = android.os.Process.myTid();
    }

    /**
     * 这下面都是暴露给外界使用的get方法.
     * @return
     */


    public static BaseApplication getmContext() {

        return mContext;
    }

    public static Handler getmMainThreadHandler() {

        return mMainThreadHandler;
    }

    public static Looper getmMainThreadLooper() {

        return mMainThreadLooper;
    }

    public static Thread getmMainThread() {

        return mMainThread;
    }

    public static int getmMainThreadId() {

        return mMainThreadId;
    }
}
