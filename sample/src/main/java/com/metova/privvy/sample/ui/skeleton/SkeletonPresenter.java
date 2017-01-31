package com.metova.privvy.sample.ui.skeleton;

import com.metova.privvy.PrivvyPresenter;

class SkeletonPresenter extends PrivvyPresenter<SkeletonContract.View, SkeletonContract.Interactor> implements SkeletonContract.Presenter {

    SkeletonPresenter(SkeletonContract.Interactor interactor) {
        super(interactor);
    }

    @Override
    protected void setupSubscriptions() {
        //no op
    }
}
