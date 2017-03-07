package com.metova.privvy.sample.db;

import com.jakewharton.rxrelay2.PublishRelay;
import com.metova.privvy.sample.models.DescriptiveNumber;
import com.metova.privvy.sample.models.Number;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;


@Singleton
public class FakeDb {

    private PublishRelay<Number> numberRelay = PublishRelay.create();

    private Number number = new Number();

    @Inject
    public FakeDb() {
    }

    public Flowable<Number> getNumber() {
        return Flowable.just(number);
    }

    public void updateNumberBy(int value) {
        number.value += value;
        numberRelay.accept(this.number);
    }

    public Flowable<Number> numberUpdates() {
        return numberRelay.toFlowable(BackpressureStrategy.BUFFER);
    }

    public Flowable<List<DescriptiveNumber>> getNumberList() {
        List<DescriptiveNumber> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            DescriptiveNumber num = new DescriptiveNumber();
            num.description = "Number: ";
            num.value = i;
            list.add(num);
        }
        return Flowable.just(list);
    }

    public void setNumberValue(int value) {
        number.value = value;
    }

    public Flowable<DescriptiveNumber> updateListItem(int position) {
        //fake database interaction that flags the model somehow
        DescriptiveNumber num = new DescriptiveNumber();
        num.value = position;
        num.description = "Magic Number: ";

        return Flowable.just(num);
    }
}
