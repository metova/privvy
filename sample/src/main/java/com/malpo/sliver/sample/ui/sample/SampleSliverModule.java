package com.malpo.sliver.sample.ui.sample;

import dagger.Module;
import dagger.Provides;

@Module
public final class SampleSliverModule {

    private String log;

    public SampleSliverModule(String log) {
        this.log = log;
    }

    @Provides
    @SampleScope
    SampleContract.Presenter providePresenter(SampleContract.Interactor interactor) {
        return new SamplePresenter(interactor);
    }

    @Provides
    @SampleScope
    SampleContract.Interactor provideInteractor() {
        return new SampleInteractor(log);
    }

}
