package com.metova.privvy.sample.ui.skeleton;

import com.metova.privvy.sample.base.BasePresenter;

class SkeletonPresenter extends BasePresenter<SkeletonContract.View, SkeletonContract.Interactor> implements SkeletonContract.Presenter {

    SkeletonPresenter(SkeletonContract.Interactor interactor) {
        super(interactor);
    }

    @Override
    protected void setupSubscriptions() {
        //no op
    }
}
