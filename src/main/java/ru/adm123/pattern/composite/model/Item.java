package ru.adm123.pattern.composite.model;

/**
 * @author Dmitry Ushakov at 18.07.2021
 * item дерева (лист или ветка)
 */
public interface Item {

    void print();

    void addChildren(Item... items);

    void removeChild(Item item);

    void clear();

}
