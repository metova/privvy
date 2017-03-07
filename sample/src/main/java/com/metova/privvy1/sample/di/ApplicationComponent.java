package com.metova.privvy1.sample.di;

import com.metova.privvy1.sample.db.FakeDb;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    HostComponent.Builder newHost();

    FakeDb fakeDb();
}
