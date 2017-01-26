package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.base.BasePresenter;
import com.malpo.sliver.sample.models.Number;
import com.malpo.sliver.sample.ui.NumberUpdateKnot;

import timber.log.Timber;

class NumberPresenter extends BasePresenter<NumberContract.View, NumberContract.Interactor> implements NumberContract.Presenter {

    private NumberUpdateKnot numberUpdateKnot;

    private NumberMapper mapper;

    NumberPresenter(NumberContract.Interactor interactor, NumberUpdateKnot numberUpdateKnot) {
        super(interactor);
        this.numberUpdateKnot = numberUpdateKnot;
        this.mapper = new NumberMapper();
    }

    @Override
    protected void setupSubscriptions() {
        addSubscriptions(
                getInteractor().getNumber().subscribe(this::onNumberUpdated),
                getInteractor().onNumberUpdated().subscribe(this::onNumberUpdated),
                numberUpdateKnot.onNumberChanged().subscribe(getView()::updateFontSize)
        );
    }

    @Override
    public void onNumberUpdated(Number number) {
        Timber.d("Number updated to: %d", number.value);
        if (number.value > 10) {
            getInteractor().incrementNumberBy(-10);
            getInteractor().navigateToList();
        } else {
            getView().display(mapper.map(number));
        }
    }

    @Override
    public void incrementNumberBy() {
        Timber.d("Incrementing number by 10");
        getInteractor().incrementNumberBy(10);
    }

}