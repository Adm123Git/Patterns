package ru.adm123.pattern.adapter;

import ru.adm123.pattern.adapter.model.Adapter;
import ru.adm123.pattern.adapter.model.LoaderForWagonImpl;
import ru.adm123.pattern.adapter.model.Truck;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
public class Demo {

    public static void main(String[] args) {
        Truck truck = new Truck();
        LoaderForWagonImpl loaderForWagon = new LoaderForWagonImpl();
        truck.load(new Adapter(loaderForWagon));
    }

}
