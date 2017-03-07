package com.metova.privvy1;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class PrivvyHostDelegate implements PrivvyHost {

    private AppCompatActivity hostActivity;

    public PrivvyHostDelegate(AppCompatActivity hostActivity) {
        this.hostActivity = hostActivity;
    }

    @Override
    public void initialize(RouteData... routeData) {
        for (RouteData data : routeData) {
            startComponent(data);
        }
    }

    private void startComponent(RouteData routeData) {
        switch (routeData.viewType()) {
            case ACTIVITY:
                goTo(routeData);
                break;
            case FRAGMENT:
                startFragment(routeData);
                break;
        }
    }

    @Override
    public void goTo(RouteData newComponent) {
        hostActivity.startActivity(new Intent(hostActivity, newComponent.viewClass()));
    }

    private void startFragment(RouteData routeData) {
        commitFragmentTransaction(routeData.viewId(), routeData.viewClass(), routeData.tag());
    }

    @Override
    public void replace(RouteData oldComponent, RouteData newComponent) {
        commitFragmentTransaction(oldComponent.viewId(), newComponent.viewClass(), newComponent.tag());
    }

    @SuppressWarnings("TryWithIdenticalCatches")
    private void commitFragmentTransaction(@IdRes int viewId, Class<?> fragmentClass, String tag) {
        try {
            FragmentTransaction ft = hostActivity.getSupportFragmentManager().beginTransaction();
            ft.replace(viewId, (Fragment) fragmentClass.newInstance(), tag);
            ft.commit();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
