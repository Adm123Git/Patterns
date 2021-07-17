package ru.adm123.pattern.builder;

import ru.adm123.pattern.builder.model.User;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
public class Demo {

    public static void main(String[] args) {
        User user1 = new User.Builder()
                .id(1)
                .build();
        User user2 = new User.Builder()
                .name("Mike")
                .age(23)
                .build();
        User user3 = new User.Builder()
                .organization("Gazprom")
                .age(35)
                .build();
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }

}
