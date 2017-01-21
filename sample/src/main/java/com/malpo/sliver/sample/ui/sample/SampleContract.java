package com.malpo.sliver.sample.ui.sample;

import com.malpo.sliver.sample.models.Message;

import rx.Observable;

public interface SampleContract {

    interface View {
        void onSendClick();

        void display(SampleViewModel viewModel);
    }

    interface Presenter {
        void setView(SampleContract.View view);

        void sendMessage(String message);

        void onMessageReceived(SampleViewModel viewModel);

        void onMessageError(Throwable th);
    }

    interface Interactor {
        Observable<Message> sendMessageToApi(Message message);
    }

    interface Router {

    }

}
