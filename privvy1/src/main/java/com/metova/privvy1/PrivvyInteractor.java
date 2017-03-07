package com.metova.privvy1;

public abstract class PrivvyInteractor extends CompositeSubscriber implements PrivvyContract.Interactor {

    @Override
    public void unsubscribe() {
        unsubscribeSubscriptions();
    }
}
