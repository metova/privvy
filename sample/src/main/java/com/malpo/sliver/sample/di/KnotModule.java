package com.malpo.sliver.sample.di;

import com.malpo.sliver.sample.ui.NumberUpdateKnot;
import com.malpo.sliver.sample.ui.NumberUpdateKnotImpl;

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
