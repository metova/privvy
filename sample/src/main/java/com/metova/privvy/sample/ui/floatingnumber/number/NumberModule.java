package com.metova.privvy.sample.ui.floatingnumber.number;

import android.support.v7.app.AppCompatActivity;
import com.metova.privvy.sample.db.FakeDb;
import com.metova.privvy.sample.ui.floatingnumber.NumberUpdateYoke;
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
    NumberContract.Router provideRouter(AppCompatActivity activity) {
        return new NumberRouter(activity);
    }


}
