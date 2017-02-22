package com.metova.privvy;

import android.support.annotation.IdRes;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class RouteData {

    public abstract ViewType viewType();
    public abstract Class<?> viewClass();
    public abstract int viewId();

    public static Builder Builder() {
        return new AutoValue_RouteData.Builder().viewId(0);
    }

    public String tag() {
        return viewClass().getSimpleName();
    }

    @AutoValue.Builder
    public interface Builder {
        Builder viewType(ViewType viewType);
        Builder viewClass(Class<?> viewClass);
        Builder viewId(@IdRes int viewId);
        RouteData build();
    }
}
