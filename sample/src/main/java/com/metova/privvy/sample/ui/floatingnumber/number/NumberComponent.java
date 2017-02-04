package com.metova.privvy.sample.ui.floatingnumber.number;

import com.metova.privvy.RouteData;
import com.metova.privvy.ViewType;
import com.metova.privvy.sample.R;
import dagger.Subcomponent;

@NumberScope
@Subcomponent(modules = {NumberModule.class})
public interface NumberComponent {

    RouteData ROUTE_DATA = new RouteData.Builder()
            .viewType(ViewType.FRAGMENT)
            .viewClass(NumberFragment.class)
            .viewId(R.id.number_component)
            .build();

    NumberContract.Presenter presenter();

    @Subcomponent.Builder
    interface Builder {
        Builder numberModule(NumberModule module);

        NumberComponent build();
    }
}
