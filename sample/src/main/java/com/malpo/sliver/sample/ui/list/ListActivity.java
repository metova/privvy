package com.malpo.sliver.sample.ui.list;

import com.malpo.sliver.sample.R;
import com.malpo.sliver.sample.SliverApplication;
import com.malpo.sliver.sample.di.HostComponent;
import com.malpo.sliver.sample.di.HostModule;

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

public class ListActivity extends AppCompatActivity implements ListContract.View {

    @Inject
    ListComponent listComponent;

    @BindView(R.id.list_recyclerview)
    RecyclerView numberList;

    private ListContract.Presenter presenter;

    private ListAdapter listAdapter = new ListAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //since this activity is its own host, we have to build its component right here
        HostComponent hostComponent = SliverApplication.component.newHost()
                .hostModule(new HostModule(this))
                .build();

        hostComponent.sliverComponent().inject(this);

        setContentView(R.layout.list_activity);

        ButterKnife.bind(this);

        //obtain the presenter from the host
        presenter = listComponent.presenter();

        //build the adapter -- this will start out with no data, as we don't want
        //to slow down the onCreate with calls to the database, nor pollute the view's logic
        numberList.setLayoutManager(new LinearLayoutManager(this));
        numberList.setAdapter(listAdapter);

        //Setting the view to this not only allows the presenter to control the view,
        //but setView() also implicitly sets up the presenter's observable stream (which fetches the adapter data).
        //See {@link BasePresenter} as well as {@link ListPresenter} to see how the stream is set up.
        presenter.setView(this);
    }

    @Override
    public void updateList(List<ListViewModel> numbers) {
        listAdapter.setNumbers(numbers);
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
}
