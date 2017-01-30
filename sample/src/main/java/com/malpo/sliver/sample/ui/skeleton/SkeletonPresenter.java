package com.malpo.sliver.sample.ui.skeleton;

import com.malpo.sliver.sample.base.BasePresenter;

class SkeletonPresenter extends BasePresenter<SkeletonContract.View, SkeletonContract.Interactor> implements SkeletonContract.Presenter {

    SkeletonPresenter(SkeletonContract.Interactor interactor) {
        super(interactor);
    }

    @Override
    protected void setupSubscriptions() {
        //no op
    }
}
