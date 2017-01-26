package com.malpo.sliver.sample.base;

public interface BasePresenterContract<T extends BaseViewContract> {

    void setView(T view);

    void onDestroyView();

}
