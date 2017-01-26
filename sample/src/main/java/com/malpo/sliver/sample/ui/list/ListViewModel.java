package com.malpo.sliver.sample.ui.list;

final class ListViewModel {

    private final int number;
    private final String description;

    ListViewModel(final int number, final String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
