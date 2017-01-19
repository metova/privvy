package com.malpo.sliver.sample.ui.sample.di;

import com.malpo.sliver.sample.di.SliverScope;
import com.malpo.sliver.sample.ui.SampleActivity;

import dagger.Component;

@SliverScope
@Component(modules = {SampleSliverModule.class})
public interface SampleSliverComponent {
    void inject(SampleActivity activity);
}
