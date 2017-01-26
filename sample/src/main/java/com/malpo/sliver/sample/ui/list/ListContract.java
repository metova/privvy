package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.base.BaseInteractorContract;
import com.malpo.sliver.sample.base.BasePresenterContract;
import com.malpo.sliver.sample.base.BaseViewContract;
import com.malpo.sliver.sample.models.DescriptiveNumber;

import java.util.List;

import rx.Observable;

public interface ListContract {

    interface View extends BaseViewContract {
        void updateList(List<ListViewModel> numbers);
    }

    interface Presenter extends BasePresenterContract<ListContract.View> {
        void goBack();
    }

    interface Interactor extends BaseInteractorContract {
         Observable<List<DescriptiveNumber>> fetchNumberList();
    }

    interface Router {

    }
}
