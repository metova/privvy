package com.metova.privvy1.sample.ui.floatingnumber.buttons;

import com.metova.privvy1.sample.db.FakeDb;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ButtonInteractorTest {

    @Mock
    FakeDb fakeDb;

    private ButtonInteractor buttonInteractor;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        buttonInteractor = new ButtonInteractor(fakeDb);
    }

    @Test
    public void incrementNumberBy_updatesFakeDbNumber() {
        buttonInteractor.incrementNumberBy(1);
        verify(fakeDb).updateNumberBy(1);
    }

}
