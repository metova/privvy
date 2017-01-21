package com.malpo.sliver.sample;

import com.malpo.sliver.sample.ui.sample.SampleSliverComponent;
import com.malpo.sliver.sample.ui.sample.SampleSliverModule;
import dagger.Module;
import dagger.Provides;

@Module(subcomponents = SampleSliverComponent.class)
class TestSliverModule {

    @Provides
    SampleSliverComponent sampleSliverComponent(SampleSliverComponent.Builder builder) {
        return builder.sampleSliverModule(new SampleSliverModule("This is a test log")).build();
    }
}
