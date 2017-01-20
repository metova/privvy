package com.malpo.sliver.sample.ui.sample;

import com.malpo.sliver.sample.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SampleViewFragment extends Fragment implements SampleContract.View {

    private SampleSliverComponent sampleComponent;

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.message)
    TextView message;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sampleComponent = DaggerSampleSliverComponent.builder()
                .sampleSliverModule(new SampleSliverModule())
                .build();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sample_activity, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @Override
    public void display(SampleViewModel viewModel) {
        title.setText(viewModel.getTitle());
        message.setText(viewModel.getMessage());
    }

    @Override
    @OnClick(R.id.send_button)
    public void onSendClick() {
        sampleComponent.presenter().sendMessage(message.getText().toString());
    }
}
