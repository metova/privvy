package com.metova.privvy.sample.ui.skeleton;

import com.metova.privvy.sample.base.Mapper;
import com.metova.privvy.sample.models.Number;

final class SkeletonMapper extends Mapper<Number, SkeletonViewModel> {

    @Override
    public final SkeletonViewModel map(Number number) {
        return SkeletonViewModel.create(number.value);
    }
}
