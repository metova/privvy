package com.metova.privvy.sample.ui.floatingnumber;

import rx.Observable;

public interface NumberUpdateYoke {

    Observable<Integer> onNumberChanged();

    void changeNumber(int newNumber);
}
