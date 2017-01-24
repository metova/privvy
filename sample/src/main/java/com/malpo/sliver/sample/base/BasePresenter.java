package com.malpo.sliver.sample.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
import timber.log.Timber;

public class BasePresenter {

    private CompositeSubscription compositeSubscription;

    protected BasePresenter() {
        this.compositeSubscription = new CompositeSubscription();
    }

    protected void addSubscription(Subscription subscription) {
        Timber.d("Adding subscription");
        if (compositeSubscription != null) compositeSubscription.add(subscription);
    }

    protected void removeSubscription(Subscription subscription) {
        if (compositeSubscription != null) compositeSubscription.remove(subscription);
    }

    private void unsubscribeSubscriptions() {
        Timber.d("Unsubscribing subscription");
        if (compositeSubscription != null) compositeSubscription.clear();
    }

    public void onDestroyView() {
        unsubscribeSubscriptions();
    }
}
