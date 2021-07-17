package ru.adm123.pattern.adapter.model;

/**
 * @author Dmitry Ushakov on 15.07.21
 * Погрузчик, в один прием нагружающий в грузовик 5 тонн
 */
public class Loader5 implements TruckLoader {

    @Override
    public int loadToTruck() {
        return 5;
    }

    @Override
    public int getWeightInfo() {
        return 5;
    }

}
