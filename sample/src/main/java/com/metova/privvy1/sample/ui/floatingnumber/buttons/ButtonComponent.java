package com.metova.privvy1.sample.ui.floatingnumber.buttons;

import com.metova.privvy1.RouteData;
import com.metova.privvy1.ViewType;
import com.metova.privvy1.sample.R;
import dagger.Subcomponent;

@ButtonScope
@Subcomponent(modules = {ButtonModule.class})
public interface ButtonComponent {

    RouteData ROUTE_DATA = RouteData.Builder()
            .viewType(ViewType.FRAGMENT)
            .viewClass(ButtonFragment.class)
            .viewId(R.id.button_component)
            .build();

    ButtonContract.Presenter presenter();

    @Subcomponent.Builder
    interface Builder {

        Builder buttonModule(ButtonModule module);

        ButtonComponent build();
    }
}
