package com.malpo.sliver.sample.ui.sample;

final class SampleViewModel {

    final String title;

    final String message;

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
}
