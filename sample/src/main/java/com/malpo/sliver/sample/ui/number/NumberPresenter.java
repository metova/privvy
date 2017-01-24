package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.base.BasePresenter;
import com.malpo.sliver.sample.models.Number;

import timber.log.Timber;

class NumberPresenter extends BasePresenter implements NumberContract.Presenter {

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
        addSubscription(interactor.getNumber().subscribe(this::onNumberUpdated));
        addSubscription(interactor.onNumberUpdated().subscribe(this::onNumberUpdated));
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
