package ru.adm123.pattern.bridge.model;

import lombok.NonNull;
import ru.adm123.pattern.bridge.model.color.Color;
import ru.adm123.pattern.bridge.model.shape.Shape;

/**
 * @author Dmitry Ushakov on 15.07.21<br>
 * Реализация паттерна <b><u>Bridge</u></b>, позволяющая "напрямую" пользоваться методами интерфейсов, которые соединяет мост.
 * Как вариант - класс может не реализовывать какие-то из методов соединяемых интерфейсов, но тогда теряется смысл bridge-а.
 *
 * Вариант реализации этого же паттерна с инкапсуляцией методов интерфейсов - {@link FigureMethodUser}.<br>
 * Вообще более верная именно реализация, выполненная в классе {@link FigureMethodUser}, т.к. она позволяет точно так же "отдать наружу"
 * методы интерфейсов, если это нужно. А если нет - то не отдавать.
 */
public abstract class FigureMethodGetter implements Shape, Color {

    private final Shape shape;
    private final Color color;

    public FigureMethodGetter(@NonNull Shape shape,
                              @NonNull Color color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    @NonNull
    public String getColorName() {
        return color.getColorName();
    }

    @Override
    @NonNull
    public String getShapeName() {
        return shape.getShapeName();
    }

}
