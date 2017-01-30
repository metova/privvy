package com.metova.privvy.sample.ui.buttons;

import com.metova.privvy.sample.base.Contract;

public interface ButtonContract extends Contract {

    interface View extends Contract.View {

        void onIncrementClick();

        void onDecrementClick();
    }

    interface Presenter extends Contract.Presenter<View> {

        void incrementNumber();

        void decrementNumber();
    }

    interface Interactor extends Contract.Interactor {

        void incrementNumberBy(int value);
    }

    interface Router {

    }

}
