package com.malpo.sliver.sample.base;

import android.support.v7.app.AppCompatActivity;

public class BaseRouter {

    private AppCompatActivity activity;

    private BaseRouter() {
        //must provide AppCompatActivity
    }

    public BaseRouter(AppCompatActivity activity) {
        this.activity = activity;
    }

    protected AppCompatActivity getActivity() {
        return activity;
    }

}
