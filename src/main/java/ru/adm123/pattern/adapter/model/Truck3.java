package ru.adm123.pattern.adapter.model;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 15.07.21
 * Грузовик грузоподъемностью 3 тонны
 */
@Getter
public class Truck3 {

    /**
     * Максимально допустимый вес
     */
    private final int maxWeight = 3;
    /**
     * Фактически загруженный вес
     */
    private int weight;

    /**
     * Загрузка грузовика погрузчиком
     */
    public void load(@NonNull TruckLoader truckLoader) {
        weight = truckLoader.loadToTruck();
        if (weight > maxWeight) {
            crush();
            return;
        }
        ready();
    }

    /**
     * Грузовик сломался
     */
    private void crush() {
        System.out.println("Truck is crushed");
    }

    /**
     * Грузовик готов везти груз
     */
    private void ready() {
        System.out.println("Truck is loaded and ready to go");
    }

}
