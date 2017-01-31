package com.metova.privvy.sample.ui.floatingnumber.number;

import com.metova.privvy.PrivvyPresenter;
import com.metova.privvy.sample.models.Number;
import com.metova.privvy.sample.ui.floatingnumber.NumberUpdateYoke;

import timber.log.Timber;

class NumberPresenter extends PrivvyPresenter<NumberContract.View, NumberContract.Interactor> implements NumberContract.Presenter {

    private NumberUpdateYoke numberUpdateYoke;

    private NumberMapper mapper;

    NumberPresenter(NumberContract.Interactor interactor, NumberUpdateYoke numberUpdateYoke) {
        super(interactor);
        this.numberUpdateYoke = numberUpdateYoke;
        this.mapper = new NumberMapper();
    }

    @Override
    protected void setupSubscriptions() {
        addSubscriptions(
                getInteractor().getNumber().subscribe(this::onNumberUpdated),
                getInteractor().onNumberUpdated().subscribe(this::onNumberUpdated),
                numberUpdateYoke.onNumberChanged().subscribe(getView()::updateFontSize)
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