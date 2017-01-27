package com.malpo.sliver.sample.di;

import javax.inject.Singleton;

import dagger.Component;


/**
 * The top level component of the application. This component encases the different hosts (Activities)
 * that make up the UI.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    HostComponent.Builder newHost();
}
