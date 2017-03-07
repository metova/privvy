package com.metova.privvy1.sample.ui.list;

import com.metova.privvy1.PrivvyHost;
import com.metova.privvy1.RouteData;
import com.metova.privvy1.ViewType;
import com.metova.privvy1.sample.MainActivity;
import com.metova.privvy1.PrivvyRouter;

class ListRouter extends PrivvyRouter implements ListContract.Router {

    ListRouter(PrivvyHost host) {
        super(host);
    }

    @Override
    public void navigateToMain() {
        getHost().goTo(RouteData.Builder().viewType(ViewType.ACTIVITY).viewClass(MainActivity.class).build());
    }
}
