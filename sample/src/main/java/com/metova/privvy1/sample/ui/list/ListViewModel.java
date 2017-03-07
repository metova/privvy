package com.metova.privvy1.sample.ui.list;

import com.google.auto.value.AutoValue;

@AutoValue abstract class ListViewModel {

    public abstract int number();
    public abstract String description();

    public static ListViewModel create(int number, String description) {
        return new AutoValue_ListViewModel(number, description);
    }
}
