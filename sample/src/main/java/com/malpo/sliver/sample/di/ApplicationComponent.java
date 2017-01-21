package com.malpo.sliver.sample.di;

import com.malpo.sliver.sample.ui.sample.SampleViewFragment;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ApplicationModule.class, SliverModule.class})
public interface ApplicationComponent {
    void inject(SampleViewFragment fragment);
}
