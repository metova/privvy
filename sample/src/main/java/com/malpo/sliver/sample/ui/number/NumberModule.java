package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.db.FakeDb;

import dagger.Module;
import dagger.Provides;

@Module
public final class NumberModule {

    public NumberModule() {
    }

    @Provides
    @NumberScope
    NumberContract.Presenter providePresenter(NumberContract.Interactor interactor) {
        return new NumberPresenter(interactor);
    }

    @Provides
    @NumberScope
    NumberContract.Interactor provideInteractor(FakeDb fakeDb) {
        return new NumberInteractor(fakeDb);
    }

}
