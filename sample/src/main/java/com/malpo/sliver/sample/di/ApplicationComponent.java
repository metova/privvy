package com.malpo.sliver.sample.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    HostComponent.Builder newHost();
}
