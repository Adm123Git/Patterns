package ru.adm123.pattern.composite.model;

/**
 * @author Dmitry Ushakov at 18.07.2021
 * Лист дерева. На нем не может расти ничего
 */
public class ItemSheet implements Item {

    private final String name;

    public ItemSheet(String name) {
        this.name = "Sheet " + name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    @Override
    public void addChildren(Item... items) {
    }

    @Override
    public void removeChild(Item item) {
    }

    @Override
    public void clear() {
    }

}
