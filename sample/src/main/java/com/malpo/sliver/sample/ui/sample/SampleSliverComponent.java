package com.malpo.sliver.sample.ui.sample;

import dagger.Subcomponent;

@SampleScope
@Subcomponent(modules = {SampleSliverModule.class})
public interface SampleSliverComponent {

    SampleContract.Presenter presenter();

    @Subcomponent.Builder
    interface Builder {
        Builder sampleSliverModule(SampleSliverModule module);

        SampleSliverComponent build();
    }
}
