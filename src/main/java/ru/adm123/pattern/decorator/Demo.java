package ru.adm123.pattern.decorator;

import ru.adm123.pattern.decorator.model.Admin;
import ru.adm123.pattern.decorator.model.Guest;
import ru.adm123.pattern.decorator.model.Moderator;
import ru.adm123.pattern.decorator.model.User;

/**
 * @author Dmitry Ushakov at 19.07.2021
 */
public class Demo {

    public static void main(String[] args) {
        Moderator moderator = new Moderator(new User(new Guest(2, "John")));
        moderator.moderateData();
        moderator.useData();
        Admin admin = new Admin(new Moderator(new User(new Guest(3, "Mike"))));
        admin.administrateData();
        admin.useData();
    }

}
