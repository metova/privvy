package com.metova.privvy;

public interface PrivvyContract {

    interface View {

    }

    interface Presenter<T extends PrivvyContract.View> {

        void setView(T view);

        void onDestroyView();

    }

    interface Interactor {

        void dispose();
    }

    interface Router {

        PrivvyHost getHost();
    }

}
