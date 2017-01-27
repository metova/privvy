package com.malpo.sliver.sample.ui;

import com.jakewharton.rxrelay.PublishRelay;

import rx.Observable;

public class NumberUpdateKnotImpl implements NumberUpdateKnot {

    private PublishRelay<Integer> numberSubject = PublishRelay.create();

    public NumberUpdateKnotImpl() {
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
