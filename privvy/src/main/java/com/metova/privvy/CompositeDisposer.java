package com.metova.privvy;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

abstract class CompositeDisposer {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    protected void addDisposables(Disposable... disposables) {
        if (compositeDisposable != null) {
            compositeDisposable.addAll(disposables);
        }
    }

    void clearDisposables() {
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }
}

