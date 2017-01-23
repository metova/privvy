package com.malpo.sliver.sample.ui.buttons;

import dagger.Module;
import dagger.Provides;

@Module
public final class ButtonModule {

    public ButtonModule() {
    }

    @Provides
    @ButtonScope
    ButtonContract.Presenter providePresenter(ButtonContract.Interactor interactor) {
        return new ButtonPresenter(interactor);
    }

    @Provides
    @ButtonScope
    ButtonContract.Interactor provideInteractor() {
        return new ButtonInteractor();
    }

}
