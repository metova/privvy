package com.malpo.sliver.sample.di;

import dagger.Subcomponent;

@HostScope
@Subcomponent(modules = {HostModule.class, KnotModule.class})
public interface HostComponent {

    SliverComponent newSliverComponent();

    @Subcomponent.Builder
    interface Builder {

        HostComponent.Builder hostModule(HostModule module);

        HostComponent build();
    }
}
