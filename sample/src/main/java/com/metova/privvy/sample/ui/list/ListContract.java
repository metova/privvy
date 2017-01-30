package com.metova.privvy.sample.ui.list;

import com.metova.privvy.sample.base.Contract;
import com.metova.privvy.sample.models.DescriptiveNumber;

import java.util.List;

import rx.Observable;

public interface ListContract {

    interface View extends Contract.View {

        void updateList(List<ListViewModel> numbers);
    }

    interface Presenter extends Contract.Presenter<View> {

        void goBack();
    }

    interface Interactor extends Contract.Interactor {

        Observable<List<DescriptiveNumber>> fetchNumberList();

        void goBack();
    }

    interface Router {

        void navigateToMain();
    }
}
