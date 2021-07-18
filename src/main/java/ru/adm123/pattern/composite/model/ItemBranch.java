package ru.adm123.pattern.composite.model;

import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dmitry Ushakov at 18.07.2021
 * Ветка дерева. На ней могут расти другие ветки, сучки и листья
 */
public class ItemBranch implements Item {

    private final String name;
    @NonNull
    private final List<Item> children = new ArrayList<>();

    public ItemBranch(String name) {
        this.name = "Branch " + name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (Item item : children) {
            item.print();
        }
    }

    @Override
    public void addChildren(Item... items) {
        if (items != null) {
            children.addAll(Arrays.asList(items));
        }
    }

    @Override
    public void removeChild(Item item) {
        if (item != null) {
            children.remove(item);
        }
    }

    @Override
    public void clear() {
        children.clear();
    }

}
