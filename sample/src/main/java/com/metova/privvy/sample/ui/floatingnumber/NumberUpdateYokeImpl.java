package com.metova.privvy.sample.ui.floatingnumber;

import com.jakewharton.rxrelay2.PublishRelay;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

public class NumberUpdateYokeImpl implements NumberUpdateYoke {

    private PublishRelay<Integer> numberSubject = PublishRelay.create();

    public NumberUpdateYokeImpl() {
    }

    @Override
    public Flowable<Integer> onNumberChanged() {
        return numberSubject.toFlowable(BackpressureStrategy.BUFFER);
    }

    @Override
    public void changeNumber(int newNumber) {
        numberSubject.accept(newNumber);
    }

}
