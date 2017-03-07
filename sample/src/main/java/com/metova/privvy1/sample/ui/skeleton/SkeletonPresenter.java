package com.metova.privvy1.sample.ui.skeleton;

import com.metova.privvy1.PrivvyPresenter;

class SkeletonPresenter extends PrivvyPresenter<SkeletonContract.View, SkeletonContract.Interactor> implements SkeletonContract.Presenter {

    SkeletonPresenter(SkeletonContract.Interactor interactor) {
        super(interactor);
    }

    @Override
    protected void setupSubscriptions() {
        //no op
    }
}
