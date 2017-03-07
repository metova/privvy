package com.metova.privvy1.sample.ui.floatingnumber.number;

import com.metova.privvy1.Mapper;
import com.metova.privvy1.sample.models.Number;

final class NumberMapper extends Mapper<Number, NumberViewModel> {

    @Override
    public final NumberViewModel map(Number number) {
        return NumberViewModel.create(number.value);
    }
}
