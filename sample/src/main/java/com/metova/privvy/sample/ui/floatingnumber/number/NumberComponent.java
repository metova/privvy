package com.metova.privvy.sample.ui.floatingnumber.number;

import dagger.Subcomponent;

@NumberScope
@Subcomponent(modules = {NumberModule.class})
public interface NumberComponent {

    NumberContract.Presenter presenter();

    @Subcomponent.Builder
    interface Builder {
        Builder numberModule(NumberModule module);

        NumberComponent build();
    }
}
