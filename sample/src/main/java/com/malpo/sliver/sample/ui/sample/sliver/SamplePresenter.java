package com.malpo.sliver.sample.ui.sample.sliver;

import timber.log.Timber;

public class SamplePresenter {

    private SampleInteractor interactor;

    public SamplePresenter(SampleInteractor interactor) {
        this.interactor = interactor;
    }

    public void log(String message) {
        Timber.d(message);
    }
}
