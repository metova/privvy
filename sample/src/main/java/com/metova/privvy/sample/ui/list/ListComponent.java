package com.metova.privvy.sample.ui.list;

import dagger.Subcomponent;

@ListScope
@Subcomponent(modules = {ListModule.class})
public interface ListComponent {

    ListContract.Presenter presenter();

    @Subcomponent.Builder
    interface Builder {
        Builder listModule(ListModule module);

        ListComponent build();
    }

}
