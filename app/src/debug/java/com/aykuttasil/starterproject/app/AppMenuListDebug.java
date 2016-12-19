package com.aykuttasil.starterproject.app;

import com.facebook.stetho.Stetho;

/**
 * Created by aykutasil on 27.11.2016.
 */


public class AppMenuListDebug extends AppMenuList {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }

}
