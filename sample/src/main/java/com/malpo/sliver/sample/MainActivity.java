package com.malpo.sliver.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.malpo.sliver.sample.travelagent.TravelAgent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TravelAgent.routeToSample(this);
    }
}
