package com.metova.privvy.sample.ui.list;

import com.metova.privvy.PrivvyHost;
import com.metova.privvy.RouteData;
import com.metova.privvy.ViewType;
import com.metova.privvy.sample.MainActivity;
import com.metova.privvy.PrivvyRouter;

class ListRouter extends PrivvyRouter implements ListContract.Router {

    ListRouter(PrivvyHost host) {
        super(host);
    }

    @Override
    public void navigateToMain() {
        getHost().goTo(new RouteData.Builder().viewType(ViewType.ACTIVITY).viewClass(MainActivity.class).build());
    }
}
