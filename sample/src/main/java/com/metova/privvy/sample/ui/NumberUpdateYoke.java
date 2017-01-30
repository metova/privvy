package com.metova.privvy.sample.ui;

import rx.Observable;

public interface NumberUpdateYoke {

    Observable<Integer> onNumberChanged();

    void changeNumber(int newNumber);
}
