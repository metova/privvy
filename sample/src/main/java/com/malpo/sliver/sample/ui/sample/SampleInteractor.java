package com.malpo.sliver.sample.ui.sample;

import com.malpo.sliver.sample.models.Message;

import javax.inject.Inject;

import timber.log.Timber;

class SampleInteractor implements SampleContract.Interactor {

    private String log;

    public SampleInteractor(String log) {
        this.log = log;
    }

    @Override
    public void sendMessageToApi(Message message) {
        Timber.d(log);
    }
}
