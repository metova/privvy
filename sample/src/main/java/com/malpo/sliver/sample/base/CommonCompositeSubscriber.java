package com.malpo.sliver.sample.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

abstract class CommonCompositeSubscriber {

    private CompositeSubscription compositeSubscription = new CompositeSubscription();

    protected void addSubscriptions(Subscription... subscriptions) {
        if (compositeSubscription != null) {
            for (Subscription s : subscriptions) {
                compositeSubscription.add(s);
            }
        }
    }

    protected void removeSubscription(Subscription subscription) {
        if (compositeSubscription != null) compositeSubscription.remove(subscription);
    }

    protected void unsubscribeSubscriptions() {
        if (compositeSubscription != null) compositeSubscription.clear();
    }
}
