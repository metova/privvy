package com.malpo.sliver;

import android.app.Application;

import com.malpo.sliver.di.ApplicationComponent;
import com.malpo.sliver.di.ApplicationModule;
import com.malpo.sliver.di.DaggerApplicationComponent;

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
