package ru.adm123.pattern.decorator.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Dmitry Ushakov at 19.07.2021
 */
@Getter
public abstract class BasePerson {

    private final int id;
    private final String name;

    public BasePerson(int id,
                      String name) {
        this.id = id;
        this.name = name;
    }

}
