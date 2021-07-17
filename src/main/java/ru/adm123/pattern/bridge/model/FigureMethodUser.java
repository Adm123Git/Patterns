package ru.adm123.pattern.bridge.model;

import lombok.NonNull;
import ru.adm123.pattern.bridge.model.color.Color;
import ru.adm123.pattern.bridge.model.shape.Shape;

/**
 * @author Dmitry Ushakov on 15.07.21<br>
 * Реализация паттерна <b><u>Bridge</u></b>, инкапсулирующая методы интерфейсов, которые соединяет мост.
 * Класс, конечно, не обязан быть абстрактным, но "физический смысл" имеют только его наследники, так что...
 *
 * Вариант реализации этого же паттерна с возможностью "напрямую" использовать методы интерфейсов - {@link FigureMethodGetter}.<br>
 * Реализация, приведенная здесь - более верная, хотя и описанная в классе {@link FigureMethodGetter} имеет право на жизнь.
 */
public abstract class FigureMethodUser {

    private final Shape shape;
    private final Color color;

    public FigureMethodUser(@NonNull Shape shape,
                            @NonNull Color color) {
        this.shape = shape;
        this.color = color;
    }

    public void drawFigure() {
        System.out.println("draw " + color.getColorName() + " " + shape.getShapeName());
    }

}
