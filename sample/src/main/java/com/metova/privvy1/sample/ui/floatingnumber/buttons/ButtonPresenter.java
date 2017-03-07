package com.metova.privvy1.sample.ui.floatingnumber.buttons;

import com.metova.privvy1.PrivvyPresenter;
import com.metova.privvy1.sample.ui.floatingnumber.NumberUpdateYoke;

import timber.log.Timber;

class ButtonPresenter extends PrivvyPresenter<ButtonContract.View, ButtonContract.Interactor> implements ButtonContract.Presenter {

    private NumberUpdateYoke numberUpdateYoke;

    ButtonPresenter(ButtonContract.Interactor interactor, NumberUpdateYoke numberUpdateYoke) {
        super(interactor);
        this.numberUpdateYoke = numberUpdateYoke;
    }

    @Override
    public void incrementNumber() {
        Timber.d("Incrementing number");
        int value = 1;
        getInteractor().incrementNumberBy(value);
        numberUpdateYoke.changeNumber(value);
    }

    @Override
    public void decrementNumber() {
        Timber.d("Decrementing number");
        int value = -1;
        getInteractor().incrementNumberBy(value);
        numberUpdateYoke.changeNumber(value);
    }

    @Override
    protected void setupSubscriptions() {
        //no op
    }
}
