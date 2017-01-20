package com.malpo.sliver.sample.ui.sample;

import dagger.Module;
import dagger.Provides;

@Module
public class SampleSliverModule {

    public SampleSliverModule() {
    }

    @Provides
    @SampleScope
    SampleContract.Presenter providePresenter(SampleInteractor interactor) {
        return new SamplePresenter(interactor);
    }

    @Provides
    @SampleScope
    SampleContract.Interactor provideInteractor() {
        return new SampleInteractor();
    }

}
