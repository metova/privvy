package com.malpo.sliver.sample.ui;

import com.jakewharton.rxrelay.PublishRelay;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

/**
 * This knot allows communication between the VIPER components Number and Buttons.
 * More specifically, The {@link com.malpo.sliver.sample.ui.number.NumberPresenter} and
 * {@link com.malpo.sliver.sample.ui.buttons.ButtonPresenter}.
 *
 * This knot should only be used in the exact aforementioned context. Other knots should be created
 * for separate inter-VIPER component communication.
 */
@Singleton
public class NumberUpdateKnot {

    private PublishRelay<Integer> numberSubject = PublishRelay.create();

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
