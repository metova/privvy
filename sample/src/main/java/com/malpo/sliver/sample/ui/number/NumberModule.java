package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.db.FakeDb;
import com.malpo.sliver.sample.ui.NumberUpdateKnot;

import dagger.Module;
import dagger.Provides;

@Module
public final class NumberModule {

    public NumberModule() {
    }

    @Provides
    @NumberScope
    NumberContract.Presenter providePresenter(NumberContract.Interactor interactor, NumberUpdateKnot numberUpdateKnot) {
        return new NumberPresenter(interactor, numberUpdateKnot);
    }

    @Provides
    @NumberScope
    NumberContract.Interactor provideInteractor(FakeDb fakeDb) {
        return new NumberInteractor(fakeDb);
    }

}
