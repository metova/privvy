package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.base.BaseInteractor;
import com.malpo.sliver.sample.db.FakeDb;
import com.malpo.sliver.sample.models.DescriptiveNumber;

import java.util.List;

import rx.Observable;

class ListInteractor extends BaseInteractor implements ListContract.Interactor {

    private FakeDb fakeDb;

    ListInteractor(FakeDb fakeDb) {
        this.fakeDb = fakeDb;
    }

    @Override
    public Observable<List<DescriptiveNumber>> fetchNumberList() {
        return fakeDb.getNumberList();
    }
}
