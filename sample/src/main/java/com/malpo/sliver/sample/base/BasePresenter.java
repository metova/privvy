package com.malpo.sliver.sample.base;

import android.support.annotation.CallSuper;

public abstract class BasePresenter<T extends BaseViewContract>
        extends CommonCompositeSubscriber
        implements BasePresenterContract<T>{

    private T view;

    @Override
    public void setView(T view) {
        this.view = view;
        if (view != null) {
            setupSubscriptions();
        }
    }

    abstract protected void setupSubscriptions();

    @CallSuper
    @Override
    public void onDestroyView() {
        unsubscribeSubscriptions();
        setView(null);
    }

    public T getView() {
        return this.view;
    }

}
