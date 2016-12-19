package com.aykuttasil.starterproject.app;

import android.app.Application;

import com.aykuttasil.starterproject.BuildConfig;
import com.google.firebase.FirebaseApp;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

import hugo.weaving.DebugLog;

/**
 * Created by aykutasil on 27.11.2016.
 */

public class AppMenuList extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initMenuList();
    }

    @DebugLog
    private void initMenuList() {

        FirebaseApp.initializeApp(this);

        // FIXME: 27.11.2016 Production a geçince Log seviyesini NULL yap
        Logger.init("MenuListLogger")
                .methodCount(3)
                .logLevel(BuildConfig.DEBUG ? LogLevel.FULL : LogLevel.FULL)        // default LogLevel.FULL
                .methodOffset(0);


    }


}
