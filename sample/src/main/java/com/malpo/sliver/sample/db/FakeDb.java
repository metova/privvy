package com.malpo.sliver.sample.db;

import com.malpo.sliver.sample.models.DescriptiveNumber;
import com.malpo.sliver.sample.models.Number;

import java.util.ArrayList;
import java.util.List;

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

    public Observable<List<DescriptiveNumber>> getNumberList() {
        List<DescriptiveNumber> list = new ArrayList<>();

        for (int i = 0; i < 10; i ++) {
            DescriptiveNumber num = new DescriptiveNumber();
            num.description = "Number: ";
            num.value = i;
            list.add(num);
        }
        return Observable.just(list);
    }
}
