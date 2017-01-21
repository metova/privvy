package com.malpo.sliver.sample.ui.sample;

import com.malpo.sliver.sample.models.Message;

class SamplePresenter implements SampleContract.Presenter {

    private SampleContract.View view;

    private SampleContract.Interactor interactor;

    SamplePresenter(SampleContract.Interactor interactor) {
        this.interactor = interactor;
    }

    public void setView(SampleContract.View view) {
        this.view = view;
    }

    @Override
    public void sendMessage(String body) {
        Message message = new Message();
        message.setBody(body);
        interactor.sendMessageToApi(message);
    }

    @Override
    public void onNewMessage(Message message) {
        view.display(new SampleViewModel(message.getTitle(), message.getBody()));
    }
}
