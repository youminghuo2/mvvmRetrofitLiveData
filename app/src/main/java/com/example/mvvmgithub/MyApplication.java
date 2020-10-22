package com.example.mvvmgithub;

import android.app.Application;
import android.content.Context;

import com.tamsiree.rxkit.RxTool;

/**
 * @Author zcy
 * @CreateDate: 2020/10/22
 */
public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        RxTool.init(this);
    }
}
