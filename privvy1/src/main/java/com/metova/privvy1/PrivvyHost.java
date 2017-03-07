package com.metova.privvy1;

public interface PrivvyHost {

    void initialize(RouteData... routes);

    void replace(RouteData oldComponent, RouteData newComponent);

    void goTo(RouteData newComponent);
}
