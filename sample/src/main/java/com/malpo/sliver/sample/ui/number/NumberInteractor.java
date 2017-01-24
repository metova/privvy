package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.db.FakeDb;
import com.malpo.sliver.sample.models.Number;

import rx.Observable;

class NumberInteractor implements NumberContract.Interactor {

    private FakeDb fakeDb;

    NumberInteractor(FakeDb fakeDb) {
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
}
