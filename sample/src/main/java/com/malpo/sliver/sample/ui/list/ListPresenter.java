package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.base.BasePresenter;

class ListPresenter extends BasePresenter<ListContract.View> implements ListContract.Presenter {

    private ListContract.Interactor interactor;

    private ListMapper mapper;

    ListPresenter(ListContract.Interactor interactor) {
        this.interactor = interactor;
        mapper = new ListMapper();
    }

    @Override
    public void setupSubscriptions() {
        addSubscriptions(
                interactor.fetchNumberList()
                        .map(list -> mapper.map(list))
                        .subscribe(list -> getView().updateList(list))
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        interactor.cancelSubscriptions();
    }

    @Override
    public void goBack() {
        interactor.goBack();
    }
}
