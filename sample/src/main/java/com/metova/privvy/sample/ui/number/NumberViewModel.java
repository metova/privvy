package com.metova.privvy.sample.ui.number;

import com.google.auto.value.AutoValue;

@AutoValue abstract class NumberViewModel {

    public abstract int number();

    public static NumberViewModel create(int number) {
        return new AutoValue_NumberViewModel(number);
    }
}
