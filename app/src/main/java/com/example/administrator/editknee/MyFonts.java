package com.example.administrator.editknee;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Administrator on 23-Mar-17.
 */

public class MyFonts extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }

    private void initFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Garuda.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
