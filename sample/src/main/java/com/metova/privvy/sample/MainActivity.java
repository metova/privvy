package com.metova.privvy.sample;

import com.metova.privvy.sample.di.HostComponent;
import com.metova.privvy.sample.di.HostModule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public HostComponent hostComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hostComponent = SampleApplication.component.newHost()
                .hostModule(new HostModule(this))
                .build();

        setContentView(R.layout.main_activity);
    }
}
