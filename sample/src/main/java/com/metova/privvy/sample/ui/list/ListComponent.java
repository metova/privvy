package com.metova.privvy.sample.ui.list;

import com.metova.privvy.RouteData;
import com.metova.privvy.ViewType;
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
