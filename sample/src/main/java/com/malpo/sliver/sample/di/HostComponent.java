package com.malpo.sliver.sample.di;

import dagger.Subcomponent;

/**
 * The host component is a parent Activity (host) + the underlying VIPER subcomponents
 */
@HostScope
@Subcomponent(modules = HostModule.class)
public interface HostComponent {

    SliverComponent sliverComponent();

    @Subcomponent.Builder
    interface Builder {

        HostComponent.Builder hostModule(HostModule module);

        HostComponent build();
    }
}
