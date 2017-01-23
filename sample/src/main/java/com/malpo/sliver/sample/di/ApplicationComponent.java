package com.malpo.sliver.sample.di;

import com.malpo.sliver.sample.ui.buttons.ButtonFragment;
import com.malpo.sliver.sample.ui.number.NumberFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, SliverModule.class})
public interface ApplicationComponent {
    void inject(NumberFragment fragment);
    void inject(ButtonFragment fragment);
}
