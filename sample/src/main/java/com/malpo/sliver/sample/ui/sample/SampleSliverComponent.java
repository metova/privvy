package com.malpo.sliver.sample.ui.sample;

import dagger.Component;

@SampleScope
@Component(modules = {SampleSliverModule.class})
public interface SampleSliverComponent {

    SampleContract.Presenter presenter();
}
