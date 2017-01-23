package com.malpo.sliver.sample.ui.number;

final class NumberViewModel {

    private final int number;

    NumberViewModel(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(getNumber());
    }
}
