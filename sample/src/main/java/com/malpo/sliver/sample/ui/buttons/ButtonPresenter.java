package com.malpo.sliver.sample.ui.buttons;

import com.malpo.sliver.sample.base.BasePresenter;
import com.malpo.sliver.sample.ui.NumberUpdateKnot;

import timber.log.Timber;

class ButtonPresenter extends BasePresenter<ButtonContract.View> implements ButtonContract.Presenter {

    private ButtonContract.Interactor interactor;

    private NumberUpdateKnot numberUpdateKnot;

    ButtonPresenter(ButtonContract.Interactor interactor, NumberUpdateKnot numberUpdateKnot) {
        this.interactor = interactor;
        this.numberUpdateKnot = numberUpdateKnot;
    }

    @Override
    public void incrementNumber() {
        Timber.d("Incrementing number");
        int value = 1;
        interactor.incrementNumberBy(value);
        numberUpdateKnot.changeNumber(value);
    }

    @Override
    public void decrementNumber() {
        Timber.d("Decrementing number");
        int value = -1;
        interactor.incrementNumberBy(value);
        numberUpdateKnot.changeNumber(value);
    }

    @Override
    protected void setupSubscriptions() {
        //no op
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        interactor.cancelSubscriptions();
    }
}
