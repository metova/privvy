package com.malpo.sliver.sample;

import com.malpo.sliver.sample.di.ApplicationComponent;
import timber.log.Timber;

public class TestSliverApplication extends SliverApplication {

    @Override
    protected ApplicationComponent buildComponent() {
        Timber.d("Building test component");
        return DaggerTestComponent.builder()
                .testApplicationModule(new TestApplicationModule()).build();
    }
}
