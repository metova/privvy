package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.models.Number;

import rx.Observable;
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
    public void onNumberUpdated(Observable<Number> number) {
        number.map(mapper::map).subscribe(view::display);
    }

    @Override
    public void incrementNumberBy10() {
        Timber.d("Incrementing number by 10");
        interactor.incrementNumberBy(10);
    }
}
