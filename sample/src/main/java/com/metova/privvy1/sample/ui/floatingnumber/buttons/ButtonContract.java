package com.metova.privvy1.sample.ui.floatingnumber.buttons;

import com.metova.privvy1.PrivvyContract;

public interface ButtonContract extends PrivvyContract {

    interface View extends PrivvyContract.View {

        void onIncrementClick();

        void onDecrementClick();
    }

    interface Presenter extends PrivvyContract.Presenter<View> {

        void incrementNumber();

        void decrementNumber();
    }

    interface Interactor extends PrivvyContract.Interactor {

        void incrementNumberBy(int value);
    }

    interface Router {

    }

}
