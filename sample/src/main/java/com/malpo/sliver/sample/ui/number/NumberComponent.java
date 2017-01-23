package com.malpo.sliver.sample.ui.number;

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
