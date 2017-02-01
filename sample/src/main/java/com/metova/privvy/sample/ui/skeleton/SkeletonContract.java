package com.metova.privvy.sample.ui.skeleton;

import com.metova.privvy.PrivvyContract;

public interface SkeletonContract extends PrivvyContract {

    interface View extends PrivvyContract.View {

    }

    interface Presenter extends PrivvyContract.Presenter<View> {

    }

    interface Interactor extends PrivvyContract.Interactor {

    }

    interface Router extends PrivvyContract.Router {

    }

}
