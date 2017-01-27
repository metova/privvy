package com.malpo.sliver.sample.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * CompositeSubscriber is the parent class for {@link BaseInteractor} and {@link BasePresenter}.
 * This allows these classes to hold all of their subscriptions in one place when they need to be
 * destroyed along with the View component.
 */
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
