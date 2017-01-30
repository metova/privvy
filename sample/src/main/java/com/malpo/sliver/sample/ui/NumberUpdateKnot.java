package com.malpo.sliver.sample.ui;

import rx.Observable;

public interface NumberUpdateKnot {

    Observable<Integer> onNumberChanged();

    void changeNumber(int newNumber);
}
