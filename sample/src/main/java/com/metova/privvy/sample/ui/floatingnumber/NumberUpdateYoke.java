package com.metova.privvy.sample.ui.floatingnumber;

import io.reactivex.Flowable;

public interface NumberUpdateYoke {

    Flowable<Integer> onNumberChanged();

    void changeNumber(int newNumber);
}
