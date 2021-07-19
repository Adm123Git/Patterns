package ru.adm123.pattern.adapter.model;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
@Getter
public class Truck {

    /**
     * Загрузка грузовика погрузчиком
     */
    public void load(@NonNull LoaderForTrack loaderForTrack) {
        loaderForTrack.loadToTruck();
        ready();
    }

    /**
     * Грузовик готов везти груз
     */
    private void ready() {
        System.out.println("Truck is loaded and ready to go");
    }

}
