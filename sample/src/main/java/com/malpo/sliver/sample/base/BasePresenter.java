package com.malpo.sliver.sample.base;

import android.support.annotation.CallSuper;

public abstract class BasePresenter<V extends Contract.View, I extends Contract.Interactor> extends CompositeSubscriber implements Contract.Presenter<V>{

    private V view;

    private I interactor;

    private BasePresenter() {
        //must pass interactor
    }

    protected BasePresenter(I interactor) {
        this.interactor = interactor;
    }

    @Override
    public void setView(V view) {
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
        interactor.unsubscribe();
    }

    protected V getView() {
        return this.view;
    }

    protected I getInteractor() {
        return this.interactor;
    }

}
