package com.malpo.sliver.sample.di;

import com.malpo.sliver.sample.ui.sample.SampleSliverComponent;
import com.malpo.sliver.sample.ui.sample.SampleSliverModule;
import dagger.Module;
import dagger.Provides;

@Module(subcomponents = SampleSliverComponent.class)
class SliverModule {

    @Provides
    SampleSliverComponent sampleSliverComponent(SampleSliverComponent.Builder builder) {
        return builder.sampleSliverModule(new SampleSliverModule()).build();
    }
}
