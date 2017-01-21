package com.malpo.sliver.sample;

import com.malpo.sliver.sample.di.ApplicationComponent;
import dagger.Component;

@Component(modules = {TestSliverModule.class, TestApplicationModule.class})
interface TestComponent extends ApplicationComponent {

}
