package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.base.BaseInteractor;
import com.malpo.sliver.sample.db.FakeDb;
import com.malpo.sliver.sample.models.Number;

import rx.Observable;

class NumberInteractor extends BaseInteractor implements NumberContract.Interactor {

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
