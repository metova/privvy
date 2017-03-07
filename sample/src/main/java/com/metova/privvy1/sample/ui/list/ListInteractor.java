package com.metova.privvy1.sample.ui.list;

import com.metova.privvy1.PrivvyInteractor;
import com.metova.privvy1.sample.db.FakeDb;
import com.metova.privvy1.sample.models.DescriptiveNumber;

import java.util.List;

import rx.Observable;

class ListInteractor extends PrivvyInteractor implements ListContract.Interactor {

    private FakeDb fakeDb;
    private ListContract.Router router;

    ListInteractor(FakeDb fakeDb, ListContract.Router router) {
        this.fakeDb = fakeDb;
        this.router = router;
    }

    @Override
    public Observable<List<DescriptiveNumber>> fetchNumberList() {
        return fakeDb.getNumberList();
    }

    @Override
    public void goBack() {
        router.navigateToMain();
    }

    @Override
    public Observable<DescriptiveNumber> updateListItem(int position) {
        return fakeDb.updateListItem(position);
    }
}
