package ru.adm123.pattern.adapter;

import ru.adm123.pattern.adapter.model.Adapter;
import ru.adm123.pattern.adapter.model.Loader5;
import ru.adm123.pattern.adapter.model.Truck3;
import ru.adm123.pattern.adapter.model.TruckLoader;
import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
public class Demo {

    public static void main(String[] args) {
        Truck3 truck = new Truck3();
        Loader5 loader = new Loader5();
        // Грузовик сломается, т.к. его грузят 5-тонным погрузчиком
        tryToLoadTruck3(truck, loader);
        System.out.println("Truck repair");
        // Здесь грузовик грузят с помощью адаптера, который "подгоняет" параметры погрузчика для нормального исапользования с этим грузовиком
        tryToLoadTruck3(truck, new Adapter(loader, truck.getMaxWeight()));
    }

    /**
     * Загрузка грузовика 3-тонника погрузчиком
     */
    private static void tryToLoadTruck3(@NonNull Truck3 truck,
                                        @NonNull TruckLoader loader) {
        System.out.println("Start load truck by " + loader.getWeightInfo());
        truck.load(loader);
    }

}
