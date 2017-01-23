package com.malpo.sliver.sample.base;

public interface Mapper<From, To> {

    To map(From from);
}
