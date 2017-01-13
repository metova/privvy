package com.malpo.sliver.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.malpo.sliver.R;
import com.malpo.sliver.ui.sample.di.DaggerSampleSliverComponent;
import com.malpo.sliver.ui.sample.di.SampleSliverComponent;
import com.malpo.sliver.ui.sample.di.SampleSliverModule;
import com.malpo.sliver.ui.sample.sliver.SamplePresenter;

import javax.inject.Inject;

public class SampleActivity extends AppCompatActivity {

    SampleSliverComponent sampleComponent;

    @Inject
    SamplePresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_activity);

        sampleComponent = DaggerSampleSliverComponent.builder()
                .sampleSliverModule(new SampleSliverModule())
                .build();

        sampleComponent.inject(this);

        log();
    }

    private void log() {
        presenter.log("Yo!");
    }
}
