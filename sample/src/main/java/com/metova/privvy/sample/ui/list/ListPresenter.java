package com.metova.privvy.sample.ui.list;

import com.metova.privvy.sample.base.BasePresenter;

class ListPresenter extends BasePresenter<ListContract.View, ListContract.Interactor> implements ListContract.Presenter {

    private ListMapper mapper;

    ListPresenter(ListContract.Interactor interactor) {
        super(interactor);
        mapper = new ListMapper();
    }

    @Override
    public void setupSubscriptions() {
        addSubscriptions(
                getInteractor().fetchNumberList()
                        .map(list -> mapper.map(list))
                        .subscribe(list -> getView().updateList(list))
        );
    }

    @Override
    public void onClickTile(int position) {
        getInteractor().updateListItem(position)
                .map(descriptiveNumber -> mapper.map(descriptiveNumber))
                .subscribe(listViewModel -> getView().updateListItem(listViewModel));
    }

    @Override
    public void goBack() {
        getInteractor().goBack();
    }
}
