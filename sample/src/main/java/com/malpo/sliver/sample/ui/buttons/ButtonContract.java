package com.malpo.sliver.sample.ui.buttons;

public interface ButtonContract {

    interface View {

        void onIncrementClick();

        void onDecrementClick();

    }

    interface Presenter {

        void setView(ButtonContract.View view);

        void incrementNumber();

        void decrementNumber();
    }

    interface Interactor {

        void incrementNumberBy(int value);
    }

    interface Router {

    }

}
