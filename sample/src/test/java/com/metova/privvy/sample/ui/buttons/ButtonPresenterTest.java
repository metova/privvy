package com.metova.privvy.sample.ui.buttons;

import com.metova.privvy.sample.ui.NumberUpdateYoke;

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
    public NumberUpdateYoke mockYoke;

    private ButtonPresenter buttonPresenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        buttonPresenter = new ButtonPresenter(mockInteractor, mockYoke);
    }

    @Test
    public void incrementNumber_incrementsInteractorByOne() {
        buttonPresenter.incrementNumber();
        verify(mockInteractor).incrementNumberBy(eq(1));
    }

    @Test
    public void incrementNumber_changesYokeNumberByOne() {
        buttonPresenter.incrementNumber();
        verify(mockYoke).changeNumber(eq(1));
    }

    @Test
    public void decrementNumber_incrementsInteractorByNegativeOne() {
        buttonPresenter.decrementNumber();
        verify(mockInteractor).incrementNumberBy(eq(-1));
    }

    @Test
    public void decrementNumber_changesYokeNumberByNegativeOne() {
        buttonPresenter.decrementNumber();
        verify(mockYoke).changeNumber(eq(-1));
    }

}
