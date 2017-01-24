package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.models.Number;

import rx.Observable;

public interface NumberContract {

    interface View {

        boolean onLongClickNumber();

        void display(NumberViewModel viewModel);
    }

    interface Presenter {

        void setView(NumberContract.View view);

        void setupView();

        void incrementNumberBy10();

        void onNumberUpdated(Number number);
    }

    interface Interactor {

        Observable<Number> getNumber();

        void incrementNumberBy(int value);

        Observable<Number> onNumberUpdated();
    }

    interface Router {

    }

}
