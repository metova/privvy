package com.malpo.sliver.sample.base;

public abstract class BaseInteractor extends CommonCompositeSubscriber implements BaseInteractorContract{

    @Override
    public void cancelSubscriptions() {
        unsubscribeSubscriptions();
    }
}
