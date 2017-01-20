package com.malpo.sliver.sample.ui.sample;

import com.malpo.sliver.sample.models.Message;

import javax.inject.Inject;

import timber.log.Timber;

class SampleInteractor implements SampleContract.Interactor {

    @Inject
    public SampleInteractor() {
    }

    @Override
    public void sendMessageToApi(Message message) {
        Timber.d("Sent message!");
    }
}
