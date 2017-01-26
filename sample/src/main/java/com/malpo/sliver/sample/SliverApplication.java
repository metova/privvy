package com.malpo.sliver.sample;

import com.malpo.sliver.sample.di.ApplicationComponent;
import com.malpo.sliver.sample.di.ApplicationModule;
import com.malpo.sliver.sample.di.DaggerApplicationComponent;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;

public class SliverApplication extends Application {

    public static ApplicationComponent component;

    public static RefWatcher getRefWatcher(Context context) {
        SliverApplication application = (SliverApplication) context.getApplicationContext();
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
