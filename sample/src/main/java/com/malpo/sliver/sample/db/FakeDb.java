package com.malpo.sliver.sample.db;

import com.malpo.sliver.sample.models.Number;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
public class FakeDb {

    private PublishSubject<Number> numberSubject = PublishSubject.create();

    private Number number = new Number();

    @Inject
    public FakeDb() {
    }

    public Observable<Number> getNumber() {
        return Observable.just(number);
    }

    public void updateNumberBy(int value) {
        number.value += value;
        numberSubject.onNext(this.number);
    }

    public Observable<Number> numberUpdates() {
        return numberSubject.asObservable();
    }
}
