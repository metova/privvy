package com.metova.privvy;

import android.support.v7.app.AppCompatActivity;

public interface PrivvyContract {

    interface View {

    }

    interface Presenter<T extends PrivvyContract.View> {

        void setView(T view);

        void onDestroyView();

    }

    interface Interactor {

        void unsubscribe();
    }

    interface Router {

        AppCompatActivity getActivity();
    }

}
