package com.metova.privvy1.sample.di;

import dagger.Subcomponent;

@HostScope
@Subcomponent(modules = {HostModule.class, YokeModule.class})
public interface HostComponent {

    PrivvyComponent newPrivvyComponent();

    @Subcomponent.Builder
    interface Builder {

        HostComponent.Builder hostModule(HostModule module);

        HostComponent build();
    }
}
