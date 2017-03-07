package com.metova.privvy1.sample;

import com.metova.privvy1.sample.di.ApplicationComponent;
import timber.log.Timber;

public class TestSampleApplication extends SampleApplication {

    @Override
    protected ApplicationComponent buildComponent() {
        Timber.d("Building test component");
        return DaggerTestApplicationComponent.builder()
                .testApplicationModule(new TestApplicationModule()).build();
    }
}
