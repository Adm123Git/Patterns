package ru.adm123.pattern.singleton.model;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 16.07.21
 * Класс сервис, объект которого будет один на все приложение
 */
public class Service {

    public static Service instance;

    private Service() {
    }

    @NonNull
    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    @NonNull
    public String getHello() {
        return "Hello world";
    }

}
