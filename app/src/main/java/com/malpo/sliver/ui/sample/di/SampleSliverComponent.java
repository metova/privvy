package com.malpo.sliver.ui.sample.di;

import com.malpo.sliver.di.SliverScope;
import com.malpo.sliver.ui.SampleActivity;

import dagger.Component;

@SliverScope
@Component(modules = {SampleSliverModule.class})
public interface SampleSliverComponent {
    void inject(SampleActivity activity);
}
