package com.metova.privvy1.sample.ui.floatingnumber.number;

import com.google.auto.value.AutoValue;

@AutoValue abstract class NumberViewModel {

    public abstract int number();

    public static NumberViewModel create(int number) {
        return new AutoValue_NumberViewModel(number);
    }
}
