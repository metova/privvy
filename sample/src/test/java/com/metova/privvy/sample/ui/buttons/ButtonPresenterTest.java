package com.metova.privvy.sample.ui.buttons;

import com.metova.privvy.sample.ui.NumberUpdateKnot;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

public class ButtonPresenterTest {

    @Mock
    public ButtonContract.Interactor mockInteractor;

    @Mock
    public NumberUpdateKnot mockKnot;

    private ButtonPresenter buttonPresenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        buttonPresenter = new ButtonPresenter(mockInteractor, mockKnot);
    }

    @Test
    public void incrementNumber_incrementsInteractorByOne() {
        buttonPresenter.incrementNumber();
        verify(mockInteractor).incrementNumberBy(eq(1));
    }

    @Test
    public void incrementNumber_changesKnotNumberByOne() {
        buttonPresenter.incrementNumber();
        verify(mockKnot).changeNumber(eq(1));
    }

    @Test
    public void decrementNumber_incrementsInteractorByNegativeOne() {
        buttonPresenter.decrementNumber();
        verify(mockInteractor).incrementNumberBy(eq(-1));
    }

    @Test
    public void decrementNumber_changesKnotNumberByNegativeOne() {
        buttonPresenter.decrementNumber();
        verify(mockKnot).changeNumber(eq(-1));
    }

}
