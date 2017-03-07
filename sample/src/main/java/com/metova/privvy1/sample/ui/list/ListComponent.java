package com.metova.privvy1.sample.ui.list;

import com.metova.privvy1.RouteData;
import com.metova.privvy1.ViewType;
import dagger.Subcomponent;

@ListScope
@Subcomponent(modules = {ListModule.class})
public interface ListComponent {

    RouteData ROUTE_DATA = RouteData.Builder()
            .viewType(ViewType.ACTIVITY)
            .viewClass(ListActivity.class)
            .build();

    ListContract.Presenter presenter();

    @Subcomponent.Builder
    interface Builder {
        Builder listModule(ListModule module);

        ListComponent build();
    }

}
