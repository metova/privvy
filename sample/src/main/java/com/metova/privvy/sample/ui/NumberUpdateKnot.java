package com.metova.privvy.sample.ui;

import rx.Observable;

public interface NumberUpdateKnot {

    Observable<Integer> onNumberChanged();

    void changeNumber(int newNumber);
}
