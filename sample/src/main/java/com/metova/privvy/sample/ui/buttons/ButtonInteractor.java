package com.metova.privvy.sample.ui.buttons;

import com.metova.privvy.sample.base.BaseInteractor;
import com.metova.privvy.sample.db.FakeDb;

class ButtonInteractor extends BaseInteractor implements ButtonContract.Interactor {

    private FakeDb fakeDb;

    ButtonInteractor(FakeDb fakeDb) {
        this.fakeDb = fakeDb;
    }

    @Override
    public void incrementNumberBy(int value) {
        fakeDb.updateNumberBy(value);
    }
}
