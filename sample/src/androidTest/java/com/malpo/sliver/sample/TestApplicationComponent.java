package com.malpo.sliver.sample;

import com.malpo.sliver.sample.di.ApplicationComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TestApplicationModule.class})
interface TestApplicationComponent extends ApplicationComponent {

}