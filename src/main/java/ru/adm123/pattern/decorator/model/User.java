package ru.adm123.pattern.decorator.model;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov at 19.07.2021
 */
public class User extends Guest {

    public User(@NonNull Guest guest) {
        super(guest.getId(), guest.getName());
    }

    public void useData() {
        System.out.println("user " + getName() + " use data");
    }

    @Override
    public String getName() {
        return "(" + super.getName() + ")";
    }

}
