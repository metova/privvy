package com.metova.privvy.sample.ui.floatingnumber.number;

import com.metova.privvy.sample.base.Mapper;
import com.metova.privvy.sample.models.Number;

final class NumberMapper extends Mapper<Number, NumberViewModel> {

    @Override
    public final NumberViewModel map(Number number) {
        return NumberViewModel.create(number.value);
    }
}
