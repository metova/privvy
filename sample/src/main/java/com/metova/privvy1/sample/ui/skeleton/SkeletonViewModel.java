package com.metova.privvy1.sample.ui.skeleton;

import com.google.auto.value.AutoValue;

@AutoValue abstract class SkeletonViewModel {

    public abstract int skeletonField();

    public static SkeletonViewModel create(int field) {
        return new AutoValue_SkeletonViewModel(field);
    }
}
