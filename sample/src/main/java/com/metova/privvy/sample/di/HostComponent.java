package com.metova.privvy.sample.di;

import dagger.Subcomponent;

@HostScope
@Subcomponent(modules = {HostModule.class, KnotModule.class})
public interface HostComponent {

    PrivvyComponent newPrivvyComponent();

    @Subcomponent.Builder
    interface Builder {

        HostComponent.Builder hostModule(HostModule module);

        HostComponent build();
    }
}
