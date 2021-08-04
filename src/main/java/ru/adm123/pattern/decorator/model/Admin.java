package ru.adm123.pattern.decorator.model;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov at 19.07.2021
 */
public class Admin extends Moderator {

    public Admin(@NonNull Moderator moderator) {
        super(moderator);
    }

    public void administrateData() {
        System.out.println("admin " + getName() + " administrate data");
    }

    @Override
    public String getName() {
        return "[" + super.getName() + "]";
    }

}
