package com.metova.privvy1.sample.ui.floatingnumber.number;

import com.metova.privvy1.PrivvyInteractor;
import com.metova.privvy1.sample.db.FakeDb;
import com.metova.privvy1.sample.models.Number;

import rx.Observable;

class NumberInteractor extends PrivvyInteractor implements NumberContract.Interactor {

    private FakeDb fakeDb;

    private NumberContract.Router router;

    NumberInteractor(NumberContract.Router router, FakeDb fakeDb) {
        this.router = router;
        this.fakeDb = fakeDb;
    }

    @Override
    public Observable<Number> getNumber() {
        return fakeDb.getNumber();
    }

    @Override
    public void incrementNumberBy(int value) {
        fakeDb.updateNumberBy(value);
    }

    @Override
    public Observable<Number> onNumberUpdated() {
        return fakeDb.numberUpdates();
    }

    @Override
    public void navigateToList() {
        router.navigateToList();
    }
}
