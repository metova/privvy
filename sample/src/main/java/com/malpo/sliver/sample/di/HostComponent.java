package com.malpo.sliver.sample.di;

import com.malpo.sliver.sample.MainActivity;

import dagger.Subcomponent;

@HostScope
@Subcomponent(modules = HostModule.class)
public interface HostComponent {

    SliverComponent sliverComponent();

    void inject(MainActivity activity);

    @Subcomponent.Builder
    interface Builder {

        HostComponent.Builder numberModule(HostModule module);

        HostComponent build();
    }
}
