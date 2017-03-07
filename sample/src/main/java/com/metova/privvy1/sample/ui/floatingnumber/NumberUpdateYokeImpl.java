package com.metova.privvy1.sample.ui.floatingnumber;

import com.jakewharton.rxrelay.PublishRelay;

import rx.Observable;

public class NumberUpdateYokeImpl implements NumberUpdateYoke {

    private PublishRelay<Integer> numberSubject = PublishRelay.create();

    public NumberUpdateYokeImpl() {
    }

    @Override
    public Observable<Integer> onNumberChanged() {
        return numberSubject.asObservable();
    }

    @Override
    public void changeNumber(int newNumber) {
        numberSubject.call(newNumber);
    }

}
