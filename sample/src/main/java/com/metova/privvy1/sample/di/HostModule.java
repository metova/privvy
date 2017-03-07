package com.metova.privvy1.sample.di;

import com.metova.privvy1.PrivvyHost;
import dagger.Module;
import dagger.Provides;

@Module
public class HostModule {

    private final PrivvyHost host;

    public HostModule(PrivvyHost host) {
        this.host = host;
    }

    @Provides
    @HostScope
    PrivvyHost provideHost() {
        return host;
    }
}
