package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.base.BasePresenter;
import com.malpo.sliver.sample.models.Number;
import com.malpo.sliver.sample.ui.NumberUpdateKnot;

import timber.log.Timber;

class NumberPresenter extends BasePresenter<NumberContract.View> implements NumberContract.Presenter {

    private NumberContract.Interactor interactor;

    private NumberUpdateKnot numberUpdateKnot;

    private NumberMapper mapper;

    NumberPresenter(NumberContract.Interactor interactor, NumberUpdateKnot numberUpdateKnot) {
        this.interactor = interactor;
        this.numberUpdateKnot = numberUpdateKnot;
        this.mapper = new NumberMapper();
    }

    @Override
    protected void setupSubscriptions() {
        addSubscriptions(
                interactor.getNumber().subscribe(this::onNumberUpdated),
                interactor.onNumberUpdated().subscribe(this::onNumberUpdated),
                numberUpdateKnot.onNumberChanged().subscribe(getView()::updateFontSize)
        );
    }

    @Override
    public void onNumberUpdated(Number number) {
        Timber.d("Number updated to: %d", number.value);
        getView().display(mapper.map(number));
    }

    @Override
    public void incrementNumberBy10() {
        Timber.d("Incrementing number by 10");
        interactor.incrementNumberBy(10);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        interactor.cancelSubscriptions();
    }
}