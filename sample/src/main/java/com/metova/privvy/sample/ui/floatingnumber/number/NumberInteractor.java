package com.metova.privvy.sample.ui.floatingnumber.number;

import com.metova.privvy.PrivvyInteractor;
import com.metova.privvy.sample.db.FakeDb;
import com.metova.privvy.sample.models.Number;

import io.reactivex.Flowable;

class NumberInteractor extends PrivvyInteractor implements NumberContract.Interactor {

    private FakeDb fakeDb;

    private NumberContract.Router router;

    NumberInteractor(NumberContract.Router router, FakeDb fakeDb) {
        this.router = router;
        this.fakeDb = fakeDb;
    }

    @Override
    public Flowable<Number> getNumber() {
        return fakeDb.getNumber();
    }

    @Override
    public void incrementNumberBy(int value) {
        fakeDb.updateNumberBy(value);
    }

    @Override
    public Flowable<Number> onNumberUpdated() {
        return fakeDb.numberUpdates();
    }

    @Override
    public void navigateToList() {
        router.navigateToList();
    }
}
