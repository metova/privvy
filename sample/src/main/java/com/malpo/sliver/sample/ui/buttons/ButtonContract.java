package com.malpo.sliver.sample.ui.buttons;

import com.malpo.sliver.sample.base.BaseInteractorContract;
import com.malpo.sliver.sample.base.BasePresenterContract;
import com.malpo.sliver.sample.base.BaseViewContract;

public interface ButtonContract {

    interface View extends BaseViewContract {

        void onIncrementClick();

        void onDecrementClick();
    }

    interface Presenter extends BasePresenterContract<ButtonContract.View> {

        void incrementNumber();

        void decrementNumber();
    }

    interface Interactor extends BaseInteractorContract {

        void incrementNumberBy(int value);
    }

    interface Router {

    }

}
