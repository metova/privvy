package com.metova.privvy.sample;

import com.metova.privvy.sample.di.ApplicationComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TestApplicationModule.class})
interface TestApplicationComponent extends ApplicationComponent {

}
