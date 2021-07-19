package ru.adm123.pattern.decorator.model;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov at 19.07.2021
 */
public class Moderator extends BasePerson {

    public Moderator(@NonNull BasePerson basePerson) {
        super(basePerson.getId(), basePerson.getName());
    }

    public void moderateData() {
        System.out.println("moderator " + getName() + " moderate data");
    }

    @Override
    public String getName() {
        return "{" + super.getName() + "}";
    }

}
