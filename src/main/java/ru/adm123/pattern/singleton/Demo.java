package ru.adm123.pattern.singleton;

import ru.adm123.pattern.singleton.model.ServiceConsumer1;
import ru.adm123.pattern.singleton.model.ServiceConsumer2;

/**
 * @author Dmitry Ushakov on 16.07.21
 */
public class Demo {

    public static void main(String[] args) {
        ServiceConsumer1 sc1 = new ServiceConsumer1();
        ServiceConsumer2 sc2 = new ServiceConsumer2();
        sc1.doSomeWorkByService();
        sc2.doSomeWorkByService();
    }

}
