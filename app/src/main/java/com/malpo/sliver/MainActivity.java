package com.malpo.sliver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.malpo.sliver.travelagent.TravelAgent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TravelAgent.routeToSample(this);
    }
}
