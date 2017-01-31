package com.metova.privvy.sample.ui.list;

import com.metova.privvy.sample.R;
import com.metova.privvy.sample.SampleApplication;
import com.metova.privvy.sample.di.HostComponent;
import com.metova.privvy.sample.di.HostModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListActivity extends AppCompatActivity implements ListContract.View, ListAdapter.ListClickCallback {

    @Inject
    ListComponent listComponent;

    @BindView(R.id.list_recyclerview)
    RecyclerView numberList;

    private ListContract.Presenter presenter;

    private ListAdapter listAdapter = new ListAdapter(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HostComponent hostComponent = SampleApplication.component.newHost()
                .hostModule(new HostModule(this))
                .build();

        hostComponent.newPrivvyComponent().inject(this);

        setContentView(R.layout.list_activity);

        ButterKnife.bind(this);

        presenter = listComponent.presenter();

        numberList.setLayoutManager(new LinearLayoutManager(this));
        numberList.setAdapter(listAdapter);

        presenter.setView(this);
    }

    @Override
    public void updateList(List<ListViewModel> numbers) {
        listAdapter.setNumbers(numbers);
    }

    @Override
    public void updateListItem(ListViewModel number) {
        listAdapter.setListItem(number);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroyView();
    }

    @OnClick(R.id.list_goback)
    public void onBackClicked() {
        presenter.goBack();
    }

    @Override
    public void onItemClicked(int position) {
        presenter.onClickTile(position);
    }

}
