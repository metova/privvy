package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.base.BasePresenter;

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
    public void goBack() {
        getInteractor().goBack();
    }
}
