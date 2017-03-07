package com.metova.privvy.sample.ui.floatingnumber.number;

import com.metova.privvy.PrivvyContract;
import com.metova.privvy.sample.models.Number;

import io.reactivex.Flowable;

public interface NumberContract extends PrivvyContract {

    interface View extends PrivvyContract.View {

        boolean onLongClickNumber();

        void display(NumberViewModel viewModel);

        void updateFontSize(int scale);
    }

    interface Presenter extends PrivvyContract.Presenter<View> {

        void incrementNumberBy();

        void onNumberUpdated(Number number);
    }

    interface Interactor extends PrivvyContract.Interactor {

        Flowable<Number> getNumber();

        void incrementNumberBy(int value);

        Flowable<Number> onNumberUpdated();

        void navigateToList();
    }

    interface Router extends PrivvyContract.Router {
        void navigateToList();
    }

}
