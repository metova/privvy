package com.metova.privvy1.sample;

import com.metova.privvy1.sample.di.ApplicationComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TestApplicationModule.class})
interface TestApplicationComponent extends ApplicationComponent {

}
