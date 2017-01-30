package com.metova.privvy.sample.di;

import com.metova.privvy.sample.db.FakeDb;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    HostComponent.Builder newHost();

    FakeDb fakeDb();
}
