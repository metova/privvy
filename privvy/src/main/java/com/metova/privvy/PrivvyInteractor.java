package com.metova.privvy;

public abstract class PrivvyInteractor extends CompositeSubscriber implements PrivvyContract.Interactor {

    @Override
    public void unsubscribe() {
        unsubscribeSubscriptions();
    }
}
