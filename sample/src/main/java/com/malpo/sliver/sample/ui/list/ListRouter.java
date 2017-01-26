package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.MainActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import timber.log.Timber;

class ListRouter implements ListContract.Router {

    private AppCompatActivity activity;

    ListRouter(AppCompatActivity activity) {
        this.activity = activity;
        Timber.d(activity.getLocalClassName());
    }

    @Override
    public void navigateToMain() {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }
}
