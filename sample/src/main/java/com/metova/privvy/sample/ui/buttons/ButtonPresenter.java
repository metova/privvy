package com.metova.privvy.sample.ui.buttons;

import com.metova.privvy.sample.base.BasePresenter;
import com.metova.privvy.sample.ui.NumberUpdateKnot;

import timber.log.Timber;

class ButtonPresenter extends BasePresenter<ButtonContract.View, ButtonContract.Interactor> implements ButtonContract.Presenter {

    private NumberUpdateKnot numberUpdateKnot;

    ButtonPresenter(ButtonContract.Interactor interactor, NumberUpdateKnot numberUpdateKnot) {
        super(interactor);
        this.numberUpdateKnot = numberUpdateKnot;
    }

    @Override
    public void incrementNumber() {
        Timber.d("Incrementing number");
        int value = 1;
        getInteractor().incrementNumberBy(value);
        numberUpdateKnot.changeNumber(value);
    }

    @Override
    public void decrementNumber() {
        Timber.d("Decrementing number");
        int value = -1;
        getInteractor().incrementNumberBy(value);
        numberUpdateKnot.changeNumber(value);
    }

    @Override
    protected void setupSubscriptions() {
        //no op
    }
}
