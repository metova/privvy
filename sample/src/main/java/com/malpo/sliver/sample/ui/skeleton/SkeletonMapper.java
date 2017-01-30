package com.malpo.sliver.sample.ui.skeleton;

import com.malpo.sliver.sample.base.Mapper;
import com.malpo.sliver.sample.models.Number;

final class SkeletonMapper extends Mapper<Number, SkeletonViewModel> {

    @Override
    public final SkeletonViewModel map(Number number) {
        return SkeletonViewModel.create(number.value);
    }
}
