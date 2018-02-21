package com.example.nolle.xutils3_study.Application;

import android.app.Application;


import org.xutils.x;

public class MyApplication extends Application {
    //在这里面进行初始化，和数据库的初始化差不多(SQLiteOpenHelper)

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false);


    }
}