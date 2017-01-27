package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.base.Mapper;
import com.malpo.sliver.sample.models.Number;

final class NumberMapper extends Mapper<Number, NumberViewModel> {

    @Override
    public final NumberViewModel map(Number number) {
        return NumberViewModel.create(number.value);
    }
}
