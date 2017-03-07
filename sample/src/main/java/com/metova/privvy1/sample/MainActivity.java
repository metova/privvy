package com.metova.privvy1.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.metova.privvy1.PrivvyHost;
import com.metova.privvy1.PrivvyHostDelegate;
import com.metova.privvy1.RouteData;
import com.metova.privvy1.sample.di.HostComponent;
import com.metova.privvy1.sample.di.HostModule;
import com.metova.privvy1.sample.ui.floatingnumber.buttons.ButtonComponent;
import com.metova.privvy1.sample.ui.floatingnumber.number.NumberComponent;

public class MainActivity extends AppCompatActivity implements PrivvyHost {

    public HostComponent hostComponent;

    private PrivvyHostDelegate hostDelegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hostComponent = SampleApplication.component.newHost()
                .hostModule(new HostModule(this))
                .build();

        hostDelegate = new PrivvyHostDelegate(this);

        setContentView(R.layout.main_activity);

        initialize(NumberComponent.ROUTE_DATA, ButtonComponent.ROUTE_DATA);
    }

    @Override
    public void initialize(RouteData... routeData) {
        hostDelegate.initialize(routeData);
    }

    @Override
    public void replace(RouteData oldComponent, RouteData newComponent) {
        hostDelegate.replace(oldComponent, newComponent);
    }

    @Override
    public void goTo(RouteData newComponent) {
        hostDelegate.goTo(newComponent);
    }
}
