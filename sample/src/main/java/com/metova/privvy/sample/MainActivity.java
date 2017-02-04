package com.metova.privvy.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import com.metova.privvy.RouteData;
import com.metova.privvy.sample.di.HostComponent;
import com.metova.privvy.sample.di.HostModule;
import com.metova.privvy.sample.ui.floatingnumber.buttons.ButtonComponent;
import com.metova.privvy.sample.ui.floatingnumber.number.NumberComponent;

public class MainActivity extends AppCompatActivity {

    public HostComponent hostComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hostComponent = SampleApplication.component.newHost()
                .hostModule(new HostModule(this))
                .build();

        setContentView(R.layout.main_activity);

        initializeComponents(NumberComponent.ROUTE_DATA, ButtonComponent.ROUTE_DATA);
    }

    private void initializeComponents(RouteData... routeData) {
        for (RouteData data : routeData) {
            startComponent(data);
        }
    }

    private void startComponent(RouteData routeData) {
        switch (routeData.viewType()) {
            case ACTIVITY:
                handleActivity(routeData);
                break;
            case FRAGMENT:
                handleFragment(routeData);
                break;
        }
    }

    private void handleFragment(RouteData routeData) {
        try {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(routeData.viewId(), (Fragment) routeData.viewClass().newInstance(), routeData.tag());
            ft.commit();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void handleActivity(RouteData routeData) {
        startActivity(new Intent(this, routeData.viewClass()));
    }
}
