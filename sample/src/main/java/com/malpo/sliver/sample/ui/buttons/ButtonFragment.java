package com.malpo.sliver.sample.ui.buttons;

import com.malpo.sliver.sample.MainActivity;
import com.malpo.sliver.sample.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButtonFragment extends Fragment implements ButtonContract.View {

    @Inject
    ButtonComponent buttonComponent;

    private ButtonContract.Presenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Must obtain the host component from the parent activity in order to inject a fragment,
        //as a host is always an activity
        ((MainActivity) getActivity()).hostComponent.sliverComponent().inject(this);

        //obtain the presenter from the host
        presenter = buttonComponent.presenter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.button_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        //This is required in order for the presenter to tell this view how to behave
        presenter.setView(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        //This is required in order to prevent a memory leak. The onDestroyView method also
        //unsubscribes from any observable streams. See {@link BasePresenter}
        presenter.onDestroyView();
    }

    @Override
    @OnClick(R.id.increment_button)
    public void onIncrementClick() {
        presenter.incrementNumber();
    }

    @Override
    @OnClick(R.id.decrement_button)
    public void onDecrementClick() {
        presenter.decrementNumber();
    }
}
