package com.metova.privvy.sample.ui.skeleton;

import dagger.Subcomponent;

@SkeletonScope
@Subcomponent(modules = {SkeletonModule.class})
public interface SkeletonComponent {

    SkeletonContract.Presenter presenter();

    @Subcomponent.Builder
    interface Builder {

        Builder skeletonModule(SkeletonModule module);

        SkeletonComponent build();
    }
}
