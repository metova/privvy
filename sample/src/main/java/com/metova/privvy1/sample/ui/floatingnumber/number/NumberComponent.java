package com.metova.privvy1.sample.ui.floatingnumber.number;

import com.metova.privvy1.RouteData;
import com.metova.privvy1.ViewType;
import com.metova.privvy1.sample.R;
import dagger.Subcomponent;

@NumberScope
@Subcomponent(modules = {NumberModule.class})
public interface NumberComponent {

    RouteData ROUTE_DATA = RouteData.Builder()
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
