package com.malpo.sliver.sample.ui.buttons;

import com.malpo.sliver.sample.db.FakeDb;
import com.malpo.sliver.sample.ui.NumberUpdateKnot;

import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;

@Module
public final class ButtonModule {

    public ButtonModule() {
    }

    @Provides
    @ButtonScope
    ButtonContract.Presenter providePresenter(ButtonContract.Interactor interactor, NumberUpdateKnot numberUpdateKnot) {
        return new ButtonPresenter(interactor, numberUpdateKnot);
    }

    @Provides
    @ButtonScope
    ButtonContract.Interactor provideInteractor(FakeDb fakeDb) {
        return new ButtonInteractor(fakeDb);
    }

    @Provides
    @ButtonScope
    ButtonContract.Router provideButtonRouter(AppCompatActivity activity) {
        return new ButtonRouter(activity);
    }

}
