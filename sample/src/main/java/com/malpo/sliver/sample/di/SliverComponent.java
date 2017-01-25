package com.malpo.sliver.sample.di;

import com.malpo.sliver.sample.ui.buttons.ButtonFragment;
import com.malpo.sliver.sample.ui.number.NumberFragment;

import dagger.Subcomponent;

@SliverScope
@Subcomponent(modules = SliverModule.class)
public interface SliverComponent {

    void inject(ButtonFragment fragment);

    void inject(NumberFragment fragment);
}
