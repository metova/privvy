package com.metova.privvy.sample.di;

import com.metova.privvy.sample.ui.floatingnumber.buttons.ButtonComponent;
import com.metova.privvy.sample.ui.floatingnumber.buttons.ButtonModule;
import com.metova.privvy.sample.ui.list.ListComponent;
import com.metova.privvy.sample.ui.list.ListModule;
import com.metova.privvy.sample.ui.floatingnumber.number.NumberComponent;
import com.metova.privvy.sample.ui.floatingnumber.number.NumberModule;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {
        NumberComponent.class,
        ButtonComponent.class,
        ListComponent.class,
//        SkeletonComponent.class
})
public class PrivvyModule {

    @Provides
    NumberComponent provideNumberComponent(NumberComponent.Builder builder) {
        return builder.numberModule(new NumberModule()).build();
    }

    @Provides
    ButtonComponent provideButtonComponent(ButtonComponent.Builder builder) {
        return builder.buttonModule(new ButtonModule()).build();
    }

    @Provides
    ListComponent provideListComponent(ListComponent.Builder builder) {
        return builder.listModule(new ListModule()).build();
    }

//    @Provides
//    SkeletonComponent provideSkeletonComponent(SkeletonComponent.Builder builder) {
//        return builder.skeletonModule(new SkeletonModule()).build();
//    }
}
