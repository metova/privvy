package com.malpo.sliver.sample.ui.buttons;

import com.malpo.sliver.sample.base.BasePresenter;

import timber.log.Timber;

class ButtonPresenter extends BasePresenter implements ButtonContract.Presenter {

    private ButtonContract.View view;

    private ButtonContract.Interactor interactor;

    ButtonPresenter(ButtonContract.Interactor interactor) {
        this.interactor = interactor;
    }

    @Override
    public void setView(ButtonContract.View view) {
        this.view = view;
    }

    @Override
    public void incrementNumber() {
        Timber.d("Incrementing number");
        interactor.incrementNumberBy(1);
    }

    @Override
    public void decrementNumber() {
        Timber.d("Decrementing number");
        interactor.incrementNumberBy(-1);
    }
}
