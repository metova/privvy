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

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        component = buildComponent();
    }

    protected ApplicationComponent buildComponent() {
        Timber.d("Building actual component");
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }
}
