package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.models.Number;

import timber.log.Timber;

class NumberPresenter implements NumberContract.Presenter {

    private NumberContract.View view;

    private NumberContract.Interactor interactor;

    private NumberMapper mapper;

    NumberPresenter(NumberContract.Interactor interactor) {
        this.interactor = interactor;
        this.mapper = new NumberMapper();
    }

    @Override
    public void setView(NumberContract.View view) {
        this.view = view;
    }

    @Override
    public void setupView() {
        //TODO Figure out how to unsubscribe
        interactor.getNumber().subscribe(this::onNumberUpdated);
        interactor.onNumberUpdated().subscribe(this::onNumberUpdated);
    }

    @Override
    public void onNumberUpdated(Number number) {
        Timber.d("Number updated to: %d", number.value);
        view.display(mapper.map(number));
    }

    @Override
    public void incrementNumberBy10() {
        Timber.d("Incrementing number by 10");
        interactor.incrementNumberBy(10);
    }
}
