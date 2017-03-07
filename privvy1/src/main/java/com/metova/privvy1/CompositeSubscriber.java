package com.metova.privvy1;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

abstract class CompositeSubscriber {

    private CompositeSubscription compositeSubscription = new CompositeSubscription();

    protected void addSubscriptions(Subscription... subscriptions) {
        if (compositeSubscription != null) {
            compositeSubscription.addAll(subscriptions);
        }
    }

    void unsubscribeSubscriptions() {
        if (compositeSubscription != null) {
            compositeSubscription.clear();
        }
    }
}
