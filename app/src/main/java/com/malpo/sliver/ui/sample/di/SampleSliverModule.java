package com.malpo.sliver.ui.sample.di;

import com.malpo.sliver.di.SliverScope;
import com.malpo.sliver.ui.sample.sliver.SampleInteractor;
import com.malpo.sliver.ui.sample.sliver.SamplePresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class SampleSliverModule {

    public SampleSliverModule() {
    }

    @Provides
    @SliverScope
    SamplePresenter providePresenter(SampleInteractor interactor) {
        return new SamplePresenter(interactor);
    }

    @Provides
    @SliverScope
    SampleInteractor provideInteractor() {
        return new SampleInteractor();
    }

}
