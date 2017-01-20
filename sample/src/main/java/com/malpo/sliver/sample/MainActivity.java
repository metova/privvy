package com.malpo.sliver.sample;

import com.malpo.sliver.sample.ui.sample.SampleViewFragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        getSupportFragmentManager().beginTransaction().add(R.id.main_activity_holder, new SampleViewFragment()).commit();
    }
}
