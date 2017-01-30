package com.metova.privvy.sample.di;

import com.metova.privvy.sample.ui.NumberUpdateKnot;
import com.metova.privvy.sample.ui.NumberUpdateKnotImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class KnotModule {

    @Provides
    @HostScope
    NumberUpdateKnot provideNumberUpdateKnot() {
        return new NumberUpdateKnotImpl();
    }

}
