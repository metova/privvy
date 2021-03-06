package com.metova.privvy.sample.ui.floatingnumber.number;

import com.metova.privvy.sample.MainActivity;
import com.metova.privvy.sample.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnLongClick;

public class NumberFragment extends Fragment implements NumberContract.View {

    @Inject
    NumberComponent mNumberComponent;

    @BindView(R.id.number_text)
    TextView number;

    private NumberContract.Presenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MainActivity) getActivity()).hostComponent.newPrivvyComponent().inject(this);
        presenter = mNumberComponent.presenter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.number_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        presenter.setView(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.onDestroyView();
    }

    @Override
    public void display(NumberViewModel viewModel) {
        number.setText(String.valueOf(viewModel.number()));
    }

    @Override
    @OnLongClick(R.id.number_text)
    public boolean onLongClickNumber() {
        presenter.incrementNumberBy();
        return true;
    }

    @Override
    public void updateFontSize(int scale) {
        number.setTranslationX(number.getTranslationX() + (10 * scale));
    }
}
