package ru.adm123.pattern.adapter.model;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
public class Adapter implements LoaderForTrack {

    @NonNull
    private final LoaderForWagon loaderForWagon;

    public Adapter(@NonNull LoaderForWagon loaderForWagon) {
        this.loaderForWagon = loaderForWagon;
    }

    @Override
    public void loadToTruck() {
        loaderForWagon.loadToWagon();
    }

}
