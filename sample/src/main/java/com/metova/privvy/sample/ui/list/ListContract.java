package com.metova.privvy.sample.ui.list;

import com.metova.privvy.PrivvyContract;
import com.metova.privvy.sample.models.DescriptiveNumber;

import java.util.List;

import io.reactivex.Flowable;

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

        Flowable<List<DescriptiveNumber>> fetchNumberList();

        Flowable<DescriptiveNumber> updateListItem(int position);

        void goBack();
    }

    interface Router {

        void navigateToMain();
    }
}
