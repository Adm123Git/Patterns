package ru.adm123.pattern.singleton.model;

/**
 * @author Dmitry Ushakov on 16.07.21
 * Класс, использующий некий сервис
 */
public class ServiceConsumer1 {

    private final Service service = Service.getInstance();

    public void doSomeWorkByService() {
        System.out.println(service.getHello() + " in ServiceConsumer1");
    }

}
