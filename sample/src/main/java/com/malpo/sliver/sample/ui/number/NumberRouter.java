package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.ui.list.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import timber.log.Timber;

class NumberRouter implements NumberContract.Router {

    private AppCompatActivity activity;

    NumberRouter(AppCompatActivity activity) {
        this.activity = activity;
        Timber.d(activity.getLocalClassName());
    }

    @Override
    public void navigateToList() {
        Intent intent = new Intent(activity, ListActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }
}
