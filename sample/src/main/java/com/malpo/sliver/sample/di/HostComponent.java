package com.malpo.sliver.sample.di;

import dagger.Subcomponent;

@HostScope
@Subcomponent(modules = HostModule.class)
public interface HostComponent {

    SliverComponent sliverComponent();

    @Subcomponent.Builder
    interface Builder {

        HostComponent.Builder numberModule(HostModule module);

        HostComponent build();
    }
}
