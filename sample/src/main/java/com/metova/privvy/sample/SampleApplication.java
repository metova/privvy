package com.metova.privvy.sample;

import com.metova.privvy.sample.di.ApplicationComponent;
import com.metova.privvy.sample.di.ApplicationModule;
import com.metova.privvy.sample.di.DaggerApplicationComponent;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;

public class SampleApplication extends Application {

    public static ApplicationComponent component;

    public static RefWatcher getRefWatcher(Context context) {
        SampleApplication application = (SampleApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        refWatcher = LeakCanary.install(this);

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
