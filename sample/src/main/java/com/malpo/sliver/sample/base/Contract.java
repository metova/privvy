package com.malpo.sliver.sample.base;

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

}
