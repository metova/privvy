package com.metova.privvy.sample.ui.list;

import com.metova.privvy.PrivvyContract;
import com.metova.privvy.sample.models.DescriptiveNumber;

import java.util.List;

import rx.Observable;

public interface ListContract {

    interface View extends PrivvyContract.View {

        void updateList(List<ListViewModel> numbers);

        void updateListItem(ListViewModel number);
    }

    interface Presenter extends PrivvyContract.Presenter<View> {

        void onClickTile(int position);

        void goBack();
    }

    interface Interactor extends PrivvyContract.Interactor {

        Observable<List<DescriptiveNumber>> fetchNumberList();

        Observable<DescriptiveNumber> updateListItem(int position);

        void goBack();
    }

    interface Router {

        void navigateToMain();
    }
}
