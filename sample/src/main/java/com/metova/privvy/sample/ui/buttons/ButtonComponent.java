package com.metova.privvy.sample.ui.buttons;

import dagger.Subcomponent;

@ButtonScope
@Subcomponent(modules = {ButtonModule.class})
public interface ButtonComponent {

    ButtonContract.Presenter presenter();

    @Subcomponent.Builder
    interface Builder {

        Builder buttonModule(ButtonModule module);

        ButtonComponent build();
    }
}
