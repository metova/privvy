package com.metova.privvy.sample.ui.floatingnumber.buttons;

import com.metova.privvy.PrivvyInteractor;
import com.metova.privvy.sample.db.FakeDb;

class ButtonInteractor extends PrivvyInteractor implements ButtonContract.Interactor {

    private FakeDb fakeDb;

    ButtonInteractor(FakeDb fakeDb) {
        this.fakeDb = fakeDb;
    }

    @Override
    public void incrementNumberBy(int value) {
        fakeDb.updateNumberBy(value);
    }
}
