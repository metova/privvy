package com.metova.privvy.sample.ui.floatingnumber.number;

import com.metova.privvy.PrivvyHost;
import com.metova.privvy.PrivvyRouter;
import com.metova.privvy.sample.ui.list.ListComponent;

class NumberRouter extends PrivvyRouter implements NumberContract.Router {

    NumberRouter(PrivvyHost host) {
        super(host);
    }

    @Override
    public void navigateToList() {
        getHost().goTo(ListComponent.ROUTE_DATA);
    }
}
