package com.metova.privvy1.sample.ui.floatingnumber.number;

import com.metova.privvy1.PrivvyHost;
import com.metova.privvy1.PrivvyRouter;
import com.metova.privvy1.sample.ui.list.ListComponent;

class NumberRouter extends PrivvyRouter implements NumberContract.Router {

    NumberRouter(PrivvyHost host) {
        super(host);
    }

    @Override
    public void navigateToList() {
        getHost().goTo(ListComponent.ROUTE_DATA);
    }
}
