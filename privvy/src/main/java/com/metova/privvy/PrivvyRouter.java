package com.metova.privvy;


import android.support.v7.app.AppCompatActivity;

public class PrivvyRouter implements PrivvyContract.Router {

    private AppCompatActivity activity;

    private PrivvyRouter() {
        //must provide AppCompatActivity
    }

    public PrivvyRouter(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Override
    public AppCompatActivity getActivity() {
        return activity;
    }

}
