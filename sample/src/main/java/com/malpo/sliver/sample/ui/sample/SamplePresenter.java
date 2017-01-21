package com.malpo.sliver.sample.ui.sample;

import com.malpo.sliver.sample.models.Message;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import timber.log.Timber;

class SamplePresenter implements SampleContract.Presenter {

    private SampleContract.View view;

    private SampleContract.Interactor interactor;

    private SampleMapper mapper;


    SamplePresenter(SampleInteractor interactor) {
        this.interactor = interactor;
        this.mapper = new SampleMapper();
    }

    @Override
    public void setView(SampleContract.View view) {
        this.view = view;
    }

    @Override
    public void sendMessage(String body) {
        Message message = new Message();
        message.setBody(body);
        interactor.sendMessageToApi(message)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(model -> mapper.map(model))
                .subscribe(
                        this::onMessageReceived,
                        this::onMessageError
                );

    }

    @Override
    public void onMessageReceived(SampleViewModel viewModel) {
        Timber.d("Message Received!");
        view.display(viewModel);
    }

    @Override
    public void onMessageError(Throwable th) {
        Timber.e(th.getMessage());
    }
}
