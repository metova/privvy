package com.metova.privvy1.sample.ui.floatingnumber.number;

import com.metova.privvy1.PrivvyHost;
import com.metova.privvy1.sample.db.FakeDb;
import com.metova.privvy1.sample.ui.floatingnumber.NumberUpdateYoke;
import dagger.Module;
import dagger.Provides;

@Module
public final class NumberModule {

    @Provides
    @NumberScope
    NumberContract.Presenter providePresenter(NumberContract.Interactor interactor, NumberUpdateYoke numberUpdateYoke) {
        return new NumberPresenter(interactor, numberUpdateYoke);
    }

    @Provides
    @NumberScope
    NumberContract.Interactor provideInteractor(FakeDb fakeDb, NumberContract.Router router) {
        return new NumberInteractor(router, fakeDb);
    }

    @Provides
    @NumberScope
    NumberContract.Router provideRouter(PrivvyHost host) {
        return new NumberRouter(host);
    }


}
