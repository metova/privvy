package com.metova.privvy.sample.base;

import android.support.v7.app.AppCompatActivity;

public class BaseRouter implements Contract.Router {

    private AppCompatActivity activity;

    private BaseRouter() {
        //must provide AppCompatActivity
    }

    public BaseRouter(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Override
    public AppCompatActivity getActivity() {
        return activity;
    }

}
