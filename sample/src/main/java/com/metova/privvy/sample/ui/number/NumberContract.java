package com.metova.privvy.sample.ui.number;

import com.metova.privvy.sample.base.Contract;
import com.metova.privvy.sample.models.Number;

import rx.Observable;

public interface NumberContract extends Contract {

    interface View extends Contract.View {

        boolean onLongClickNumber();

        void display(NumberViewModel viewModel);

        void updateFontSize(int scale);
    }

    interface Presenter extends Contract.Presenter<View> {

        void incrementNumberBy();

        void onNumberUpdated(Number number);
    }

    interface Interactor extends Contract.Interactor {

        Observable<Number> getNumber();

        void incrementNumberBy(int value);

        Observable<Number> onNumberUpdated();

        void navigateToList();
    }

    interface Router extends Contract.Router {
        void navigateToList();
    }

}
