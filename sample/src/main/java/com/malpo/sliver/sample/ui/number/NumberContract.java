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

        void incrementNumberBy10();

        void onNumberUpdated(Observable<Number> number);
    }

    interface Interactor {

        void incrementNumberBy(int value);
    }

    interface Router {

    }

}
