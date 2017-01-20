package com.malpo.sliver.sample.ui.sample;

import com.malpo.sliver.sample.models.Message;

public interface SampleContract {

    interface View {
        void display(SampleViewModel viewModel);

        void onSendClick();
    }

    interface Presenter {
        void sendMessage(String message);

        void onNewMessage(Message message);
    }

    interface Interactor {
        void sendMessageToApi(Message message);
    }

    interface Router {

    }

}
