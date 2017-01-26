package com.malpo.sliver.sample.di;

import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class HostModule {

    private final AppCompatActivity activity;

    public HostModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @HostScope
    public AppCompatActivity provideActivity() {
        return activity;
    }
}
