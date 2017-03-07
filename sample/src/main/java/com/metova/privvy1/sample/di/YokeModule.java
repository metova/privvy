package com.metova.privvy1.sample.di;

import com.metova.privvy1.sample.ui.floatingnumber.NumberUpdateYoke;
import com.metova.privvy1.sample.ui.floatingnumber.NumberUpdateYokeImpl;

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
