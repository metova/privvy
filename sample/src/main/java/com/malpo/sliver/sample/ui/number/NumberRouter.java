package com.malpo.sliver.sample.ui.number;

import android.support.v7.app.AppCompatActivity;
import timber.log.Timber;

class NumberRouter implements NumberContract.Router {

    //TODO Should probably be WeakReference? Or Interactor needs callback to set router to null
    private AppCompatActivity activity;

    NumberRouter(AppCompatActivity activity) {

        this.activity = activity;
        Timber.d(activity.getLocalClassName());
    }
}
