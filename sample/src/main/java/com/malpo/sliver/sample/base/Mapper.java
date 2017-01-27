package com.malpo.sliver.sample.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Every conversion from a Database Model to a ViewModel is performed by a child of this mapper
 *
 * Mapping occurs only in a Presenter, once it has retrieved the database model from its
 * Interactor
 * @param <From> The database model
 * @param <To> The ViewModel
 */
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
