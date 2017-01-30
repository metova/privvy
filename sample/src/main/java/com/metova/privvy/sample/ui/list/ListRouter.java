package com.metova.privvy.sample.ui.list;

import com.metova.privvy.sample.MainActivity;
import com.metova.privvy.sample.base.BaseRouter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

class ListRouter extends BaseRouter implements ListContract.Router {

    ListRouter(AppCompatActivity activity) {
        super(activity);
    }

    @Override
    public void navigateToMain() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        getActivity().startActivity(intent);
    }
}