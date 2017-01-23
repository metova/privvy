package com.malpo.sliver.sample.ui.sample;

final class SampleViewModel {

    private final String title;

    private final String message;

    SampleViewModel(String title, String message) {
        this.title = title;
        this.message = message;
    }

    String getTitle() {
        return title;
    }

    String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return getTitle() + ": " + getMessage();
    }
}
