package com.malpo.sliver.sample;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import org.mockito.Mockito;

import javax.inject.Named;
import javax.inject.Singleton;

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
