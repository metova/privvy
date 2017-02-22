package com.metova.privvy.sample.di;

import com.metova.privvy.PrivvyHost;
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
