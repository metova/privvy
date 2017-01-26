package com.malpo.sliver.sample.base;

public abstract class BaseInteractor extends CompositeSubscriber implements Contract.Interactor {

    @Override
    public void unsubscribe() {
        unsubscribeSubscriptions();
    }
}
