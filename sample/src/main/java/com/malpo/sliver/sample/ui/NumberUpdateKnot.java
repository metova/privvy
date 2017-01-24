package com.malpo.sliver.sample.ui;

import com.jakewharton.rxrelay.PublishRelay;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

@Singleton
public class NumberUpdateKnot {

    PublishRelay<Integer> numberSubject = PublishRelay.create();

    @Inject
    public NumberUpdateKnot() {
    }

    public Observable<Integer> onNumberChanged() {
        return numberSubject.asObservable();
    }

    public void changeNumber(int newNumber) {
        numberSubject.call(newNumber);
    }

}
