package ru.adm123.pattern.adapter.model;

/**
 * @author Dmitry Ushakov on 15.07.21
 *
 * Умение загружать грузовики
 *
 */
public interface TruckLoader {

    /**
     * Загрузить в грузовик
     * @return вес, который загружается
     */
    int loadToTruck();

    /**
     * Просто инфа о том, сколько конкретный погрузчик вывалит за раз
     * @return вес, идущий в одной загрузке
     */
    int getWeightInfo();

}
