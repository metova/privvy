package com.metova.privvy1.sample.ui.floatingnumber;

import rx.Observable;

public interface NumberUpdateYoke {

    Observable<Integer> onNumberChanged();

    void changeNumber(int newNumber);
}
