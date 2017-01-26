package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.base.BaseInteractor;
import com.malpo.sliver.sample.db.FakeDb;
import com.malpo.sliver.sample.models.DescriptiveNumber;

import java.util.List;

import rx.Observable;

class ListInteractor extends BaseInteractor implements ListContract.Interactor {

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
}
