package com.metova.privvy.sample.ui.buttons;

import com.metova.privvy.sample.base.BasePresenter;
import com.metova.privvy.sample.ui.NumberUpdateYoke;

import timber.log.Timber;

class ButtonPresenter extends BasePresenter<ButtonContract.View, ButtonContract.Interactor> implements ButtonContract.Presenter {

    private NumberUpdateYoke mNumberUpdateYoke;

    ButtonPresenter(ButtonContract.Interactor interactor, NumberUpdateYoke numberUpdateYoke) {
        super(interactor);
        this.mNumberUpdateYoke = numberUpdateYoke;
    }

    @Override
    public void incrementNumber() {
        Timber.d("Incrementing number");
        int value = 1;
        getInteractor().incrementNumberBy(value);
        mNumberUpdateYoke.changeNumber(value);
    }

    @Override
    public void decrementNumber() {
        Timber.d("Decrementing number");
        int value = -1;
        getInteractor().incrementNumberBy(value);
        mNumberUpdateYoke.changeNumber(value);
    }

    @Override
    protected void setupSubscriptions() {
        //no op
    }
}
