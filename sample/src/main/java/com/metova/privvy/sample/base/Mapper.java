package com.metova.privvy.sample.base;

import java.util.ArrayList;
import java.util.List;

public abstract class Mapper<From, To> {

    protected abstract To map(From from);

    public List<To> map(List<From> list) {
        final List<To> result = new ArrayList<>(list.size());
        for (From from : list) {
            result.add(map(from));
        }
        return result;
    }
}
