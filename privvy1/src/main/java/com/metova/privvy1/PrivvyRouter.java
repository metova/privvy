package com.metova.privvy1;

public class PrivvyRouter implements PrivvyContract.Router {

    private PrivvyHost host;

    public PrivvyRouter(PrivvyHost host) {
        this.host = host;
    }

    @Override
    public PrivvyHost getHost() {
        return host;
    }

}
