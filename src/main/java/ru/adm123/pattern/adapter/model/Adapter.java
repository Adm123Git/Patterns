package ru.adm123.pattern.adapter.model;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 15.07.21
 * Адаптер для погрузчика, позволяющий грузить только определенный вес
 */
public class Adapter implements TruckLoader {

    /**
     * Тот погрузчик, работу которого корректирует этот адаптер
     */
    @NonNull
    private final TruckLoader truckLoader;
    /**
     * Максимальный вес, который адаптер нагрузит на грузовик
     */
    private final int weightLimit;

    public Adapter(@NonNull TruckLoader truckLoader,
                   int weightLimit) {
        this.truckLoader = truckLoader;
        this.weightLimit = weightLimit;
    }

    @Override
    public int loadToTruck() {
        return getLimitedWeight(truckLoader.loadToTruck());
    }

    @Override
    public int getWeightInfo() {
        return truckLoader.getWeightInfo();
    }

    /**
     * Из того веса, который вываливает погрузчик, выбираем допустимую часть и отдаем, а остальное возвращаем на склад.
     *
     * @param weight вес, который пытаемся запихнуть на грузовик
     */
    private int getLimitedWeight(int weight) {
        if (weight > weightLimit) {
            System.out.printf("%d sended back, %d load to truck", weight - weightLimit, weightLimit);
            System.out.println();
            return weightLimit;
        }
        return weight;
    }

}
