package com.malpo.sliver.sample.di;

import com.malpo.sliver.sample.db.FakeDb;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    HostComponent.Builder newHost();

    FakeDb fakeDb();
}
