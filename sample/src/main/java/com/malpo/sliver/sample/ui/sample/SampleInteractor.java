package com.malpo.sliver.sample.ui.sample;

import com.malpo.sliver.sample.models.Message;

import java.util.concurrent.Callable;

import javax.inject.Inject;

import rx.Observable;
import timber.log.Timber;

class SampleInteractor implements SampleContract.Interactor {

    private String log;

    public SampleInteractor(String log) {
        this.log = log;
    }

    @Override
    public Observable<Message> sendMessageToApi(Message message) {
	Timber.d(log);
        Timber.d("Sending message!");
        return Observable.fromCallable(mockApiCall(message));
    }

    private Callable<Message> mockApiCall(Message message) {
        Timber.d("Inside callable!");
        return () -> new Message("New Message", "Woah, sick message bro");
    }
}
