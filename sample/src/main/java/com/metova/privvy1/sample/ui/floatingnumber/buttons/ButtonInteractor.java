package com.metova.privvy1.sample.ui.floatingnumber.buttons;

import com.metova.privvy1.PrivvyInteractor;
import com.metova.privvy1.sample.db.FakeDb;

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
