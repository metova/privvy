package com.malpo.sliver.sample.di;

import com.malpo.sliver.sample.ui.sample.SampleViewFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={ApplicationModule.class})
public interface ApplicationComponent {
    void inject(SampleViewFragment fragment);
}
