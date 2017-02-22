package com.metova.privvy.sample.ui.floatingnumber.buttons;

import com.metova.privvy.PrivvyHost;
import com.metova.privvy.sample.db.FakeDb;
import com.metova.privvy.sample.ui.floatingnumber.NumberUpdateYoke;

import dagger.Module;
import dagger.Provides;

@Module
public final class ButtonModule {

    public ButtonModule() {
    }

    @Provides
    @ButtonScope
    ButtonContract.Presenter providePresenter(ButtonContract.Interactor interactor, NumberUpdateYoke numberUpdateYoke) {
        return new ButtonPresenter(interactor, numberUpdateYoke);
    }

    @Provides
    @ButtonScope
    ButtonContract.Interactor provideInteractor(FakeDb fakeDb) {
        return new ButtonInteractor(fakeDb);
    }

    @Provides
    @ButtonScope
    ButtonContract.Router provideButtonRouter(PrivvyHost host) {
        return new ButtonRouter(host);
    }

}
