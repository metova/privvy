package com.metova.privvy.sample.ui.skeleton;

import com.metova.privvy.sample.base.Contract;

public interface SkeletonContract extends Contract {

    interface View extends Contract.View {

    }

    interface Presenter extends Contract.Presenter<View> {

    }

    interface Interactor extends Contract.Interactor {

    }

    interface Router extends Contract.Router {

    }

}
