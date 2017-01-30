package com.metova.privvy.sample.di;

import com.metova.privvy.sample.ui.floatingnumber.buttons.ButtonFragment;
import com.metova.privvy.sample.ui.list.ListActivity;
import com.metova.privvy.sample.ui.floatingnumber.number.NumberFragment;

import dagger.Subcomponent;

@PrivvyScope
@Subcomponent(modules = PrivvyModule.class)
public interface PrivvyComponent {

    void inject(ButtonFragment fragment);

    void inject(NumberFragment fragment);

    void inject(ListActivity activity);

//    void inject(SkeletonFragment fragment);
}
