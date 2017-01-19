package com.malpo.sliver.sample.ui.sample.di;

import com.malpo.sliver.sample.ui.sample.sliver.SampleInteractor;
import com.malpo.sliver.sample.ui.sample.sliver.SamplePresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class SampleSliverModule {

    public SampleSliverModule() {
    }

    @Provides
    @SampleScope
    SamplePresenter providePresenter(SampleInteractor interactor) {
        return new SamplePresenter(interactor);
    }

    @Provides
    @SampleScope
    SampleInteractor provideInteractor() {
        return new SampleInteractor();
    }

}
