package com.malpo.sliver.sample;

import com.malpo.sliver.sample.di.ApplicationComponent;
import com.malpo.sliver.sample.di.ApplicationModule;
import com.malpo.sliver.sample.di.DaggerApplicationComponent;

import android.app.Application;

import timber.log.Timber;

public class SliverApplication extends Application {

    public static ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
