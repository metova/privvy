package com.metova.privvy.sample.base;

public abstract class BaseInteractor extends CompositeSubscriber implements Contract.Interactor {

    @Override
    public void unsubscribe() {
        unsubscribeSubscriptions();
    }
}
