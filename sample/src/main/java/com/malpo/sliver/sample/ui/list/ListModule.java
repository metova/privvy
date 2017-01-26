package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.db.FakeDb;

import dagger.Module;
import dagger.Provides;

@Module
public class ListModule {

    public ListModule() {

    }

    @Provides
    @ListScope
    ListContract.Presenter providePresenter(ListContract.Interactor interactor) {
        return new ListPresenter(interactor);
    }

    @Provides
    @ListScope
    ListContract.Interactor provideInteractor(FakeDb fakeDb) {
        return new ListInteractor(fakeDb);
    }
}