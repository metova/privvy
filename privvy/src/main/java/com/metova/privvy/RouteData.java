package com.metova.privvy;

import android.support.annotation.IdRes;

public final class RouteData {

    private final ViewType viewType;
    private final Class<?> viewClass;
    @IdRes
    private int viewId;

    private RouteData(ViewType viewType, Class<?> viewClass, @IdRes int viewId) {
        this.viewType = viewType;
        this.viewClass = viewClass;
        this.viewId = viewId;
    }

    public ViewType viewType() {
        return viewType;
    }

    public Class<?> viewClass() {
        return viewClass;
    }

    @IdRes
    public int viewId() {
        return viewId;
    }

    public String tag() {
        return viewClass.getSimpleName();
    }

    public static class Builder {
        private ViewType viewType;
        private Class<?> viewClass;
        @IdRes
        private int viewId;

        public Builder viewType(ViewType viewType) {
            this.viewType = viewType;
            return this;
        }

        public Builder viewClass(Class<?> viewClass) {
            this.viewClass = viewClass;
            return this;
        }

        public Builder viewId(@IdRes int viewId) {
            this.viewId = viewId;
            return this;
        }

        public RouteData build() {
            return new RouteData(viewType, viewClass, viewId);
        }
    }
}
