package com.metova.privvy.sample;

import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;


@Module
public final class TestApplicationModule {

    @Provides
    @Named("application")
    @Singleton
    Context provideApplicationContext() {
        return mock(Context.class);
    }
}
