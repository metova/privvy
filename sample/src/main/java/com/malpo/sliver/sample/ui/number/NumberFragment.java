package com.malpo.sliver.sample.ui.number;

import com.malpo.sliver.sample.R;
import com.malpo.sliver.sample.SliverApplication;

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

    @BindView(R.id.number)
    TextView number;

    private NumberContract.Presenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SliverApplication.component.inject(this);
        presenter = mNumberComponent.presenter();
        presenter.setView(this);
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
    }

    @Override
    public void display(NumberViewModel viewModel) {
        number.setText(viewModel.getNumber());
    }

    @Override
    @OnLongClick(R.id.number)
    public boolean onLongClickNumber() {
        presenter.incrementNumberBy10();
        return true;
    }
}
