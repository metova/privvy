package com.malpo.sliver.sample.base;

import android.support.v7.app.AppCompatActivity;

public interface Contract {

    interface View {

    }

    interface Presenter<T extends Contract.View> {

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
