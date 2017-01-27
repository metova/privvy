package com.malpo.sliver.sample.base;


/**
 * Base class for all VIPER component contracts that get put into the application. There is
 * a single contract for every "feature" component, i.e. a view with corresponding logic.
 * <p>
 * A contract is necessary for the UI architecture to work, as it builds the relationship
 * between a View, Presenter, Interactor, and Router.
 */
public interface Contract {

    interface View {

    }

    interface Presenter<T extends Contract.View> {

        void setView(T view);

        void onDestroyView();

    }

    interface Interactor {

        void unsubscribe();
    }

    interface Router {

    }

}
