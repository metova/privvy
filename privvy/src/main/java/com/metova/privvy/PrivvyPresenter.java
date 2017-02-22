package com.metova.privvy;

import android.support.annotation.CallSuper;

public abstract class PrivvyPresenter<V extends PrivvyContract.View, I extends PrivvyContract.Interactor> extends CompositeSubscriber implements PrivvyContract.Presenter<V>{

    private V view;

    private I interactor;

    protected PrivvyPresenter(I interactor) {
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
