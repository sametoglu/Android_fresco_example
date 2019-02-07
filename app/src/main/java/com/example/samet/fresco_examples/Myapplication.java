package com.example.samet.fresco_examples;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by samet on 17.04.2018.
 */

public class Myapplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
