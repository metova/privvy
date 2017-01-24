package com.malpo.sliver.sample.ui.buttons;

import com.malpo.sliver.sample.base.BaseInteractorContract;
import com.malpo.sliver.sample.base.BasePresenterContract;

public interface ButtonContract {

    interface View {

        void onIncrementClick();

        void onDecrementClick();
    }

    interface Presenter extends BasePresenterContract {

        void setView(ButtonContract.View view);

        void incrementNumber();

        void decrementNumber();
    }

    interface Interactor extends BaseInteractorContract {

        void incrementNumberBy(int value);
    }

    interface Router {

    }

}
