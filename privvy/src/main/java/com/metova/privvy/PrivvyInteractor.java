package com.metova.privvy;

public abstract class PrivvyInteractor extends CompositeDisposer implements PrivvyContract.Interactor {

    @Override
    public void dispose() {
        clearDisposables();
    }
}
