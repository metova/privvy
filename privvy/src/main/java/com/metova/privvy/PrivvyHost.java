package com.metova.privvy;

public interface PrivvyHost {

    void initialize(RouteData... routes);

    void replace(RouteData oldComponent, RouteData newComponent);

    void goTo(RouteData newComponent);
}
