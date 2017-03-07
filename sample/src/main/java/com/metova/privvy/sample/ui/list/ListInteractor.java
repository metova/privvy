package com.metova.privvy.sample.ui.list;

import com.metova.privvy.PrivvyInteractor;
import com.metova.privvy.sample.db.FakeDb;
import com.metova.privvy.sample.models.DescriptiveNumber;

import java.util.List;

import io.reactivex.Flowable;

class ListInteractor extends PrivvyInteractor implements ListContract.Interactor {

    private FakeDb fakeDb;
    private ListContract.Router router;

    ListInteractor(FakeDb fakeDb, ListContract.Router router) {
        this.fakeDb = fakeDb;
        this.router = router;
    }

    @Override
    public Flowable<List<DescriptiveNumber>> fetchNumberList() {
        return fakeDb.getNumberList();
    }

    @Override
    public void goBack() {
        router.navigateToMain();
    }

    @Override
    public Flowable<DescriptiveNumber> updateListItem(int position) {
        return fakeDb.updateListItem(position);
    }
}
