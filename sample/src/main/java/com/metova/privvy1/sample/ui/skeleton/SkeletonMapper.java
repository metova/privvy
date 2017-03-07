package com.metova.privvy1.sample.ui.skeleton;

import com.metova.privvy1.Mapper;
import com.metova.privvy1.sample.models.Number;

final class SkeletonMapper extends Mapper<Number, SkeletonViewModel> {

    @Override
    public final SkeletonViewModel map(Number number) {
        return SkeletonViewModel.create(number.value);
    }
}
