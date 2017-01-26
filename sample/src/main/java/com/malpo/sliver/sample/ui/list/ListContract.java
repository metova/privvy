package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.base.Contract;
import com.malpo.sliver.sample.models.DescriptiveNumber;

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
