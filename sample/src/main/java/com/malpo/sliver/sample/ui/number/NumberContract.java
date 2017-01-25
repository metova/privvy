package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.base.BaseInteractorContract;
import com.malpo.sliver.sample.base.BasePresenterContract;
import com.malpo.sliver.sample.models.Number;

import rx.Observable;

public interface NumberContract {

    interface View {

        boolean onLongClickNumber();

        void display(NumberViewModel viewModel);

        void updateFontSize(int scale);
    }

    interface Presenter extends BasePresenterContract {

        void setView(NumberContract.View view);

        void setupView();

        void incrementNumberBy10();

        void onNumberUpdated(Number number);
    }

    interface Interactor extends BaseInteractorContract{

        Observable<Number> getNumber();

        void incrementNumberBy(int value);

        Observable<Number> onNumberUpdated();
    }

    interface Router {

    }

}
