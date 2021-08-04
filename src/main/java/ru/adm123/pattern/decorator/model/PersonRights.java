package ru.adm123.pattern.decorator.model;

/**
 * @author Dmitry Ushakov at 19.07.2021
 */
public interface PersonRights {

    default void seeData() {
        System.out.println("person see data");
    }

}
