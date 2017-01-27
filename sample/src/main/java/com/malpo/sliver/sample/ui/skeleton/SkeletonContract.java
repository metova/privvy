package com.malpo.sliver.sample.ui.skeleton;

import com.malpo.sliver.sample.base.Contract;

public interface SkeletonContract extends Contract {

    interface View extends Contract.View {

    }

    interface Presenter extends Contract.Presenter<View> {

    }

    interface Interactor extends Contract.Interactor {

    }

    interface Router {

    }

}
