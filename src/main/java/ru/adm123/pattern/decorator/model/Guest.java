package ru.adm123.pattern.decorator.model;

import lombok.Getter;

/**
 * @author Dmitry Ushakov at 19.07.2021
 */
@Getter
public class Guest implements PersonRights {

    private final int id;
    private final String name;

    public Guest(int id,
                 String name) {
        this.id = id;
        this.name = name;
    }

}
