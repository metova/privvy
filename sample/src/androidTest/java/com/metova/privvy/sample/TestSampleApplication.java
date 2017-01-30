package com.metova.privvy.sample;

import com.metova.privvy.sample.di.ApplicationComponent;
import timber.log.Timber;

public class TestSampleApplication extends SampleApplication {

    @Override
    protected ApplicationComponent buildComponent() {
        Timber.d("Building test component");
        return DaggerTestApplicationComponent.builder()
                .testApplicationModule(new TestApplicationModule()).build();
    }
}
