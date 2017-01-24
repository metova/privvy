package com.malpo.sliver.sample.ui.buttons;

import com.malpo.sliver.sample.base.BaseInteractor;
import com.malpo.sliver.sample.db.FakeDb;

class ButtonInteractor extends BaseInteractor implements ButtonContract.Interactor {

    private FakeDb fakeDb;

    ButtonInteractor(FakeDb fakeDb) {
        this.fakeDb = fakeDb;
    }

    @Override
    public void incrementNumberBy(int value) {
        fakeDb.updateNumberBy(value);
    }

    @Override
    public void cancelSubscriptions() {
        unsubscribeSubscriptions();
    }
}
