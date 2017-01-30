package com.metova.privvy.sample.di;

import com.metova.privvy.sample.ui.floatingnumber.NumberUpdateYoke;
import com.metova.privvy.sample.ui.floatingnumber.NumberUpdateYokeImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class YokeModule {

    @Provides
    @HostScope
    NumberUpdateYoke provideNumberUpdateYoke() {
        return new NumberUpdateYokeImpl();
    }

}
