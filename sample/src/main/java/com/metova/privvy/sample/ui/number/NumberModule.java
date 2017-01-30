package com.metova.privvy.sample.ui.number;

import com.metova.privvy.sample.db.FakeDb;
import com.metova.privvy.sample.ui.NumberUpdateKnot;

import android.support.v7.app.AppCompatActivity;

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
    NumberContract.Interactor provideInteractor(FakeDb fakeDb, NumberContract.Router router) {
        return new NumberInteractor(router, fakeDb);
    }

    @Provides
    @NumberScope
    NumberContract.Router provideRouter(AppCompatActivity activity) {
        return new NumberRouter(activity);
    }

}
