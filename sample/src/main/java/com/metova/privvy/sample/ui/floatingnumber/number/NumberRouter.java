package com.metova.privvy.sample.ui.floatingnumber.number;

import com.metova.privvy.sample.base.BaseRouter;
import com.metova.privvy.sample.ui.list.ListActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import timber.log.Timber;

class NumberRouter extends BaseRouter implements NumberContract.Router {

    NumberRouter(AppCompatActivity activity) {
        super(activity);
        Timber.d(activity.getLocalClassName());
    }

    @Override
    public void navigateToList() {
        Intent intent = new Intent(getActivity(), ListActivity.class);
        getActivity().startActivity(intent);
    }
}
