package com.metova.privvy1.sample.ui.list;

import com.metova.privvy1.PrivvyHost;
import com.metova.privvy1.sample.db.FakeDb;
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
    ListContract.Interactor provideInteractor(FakeDb fakeDb, ListContract.Router router) {
        return new ListInteractor(fakeDb, router);
    }

    @Provides
    @ListScope
    ListContract.Router provideRouter(PrivvyHost host) {
        return new ListRouter(host);
    }
}
