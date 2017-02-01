package com.metova.privvy.sample;

import com.metova.privvy.sample.di.ApplicationComponent;
import com.metova.privvy.sample.di.ApplicationModule;
import com.metova.privvy.sample.di.DaggerApplicationComponent;

import android.app.Application;

import timber.log.Timber;

public class SampleApplication extends Application {

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
