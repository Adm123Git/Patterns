package ru.adm123.pattern.bridge;

import lombok.NonNull;
import ru.adm123.pattern.bridge.model.FigureMethodGetter;
import ru.adm123.pattern.bridge.model.FigureMethodUser;
import ru.adm123.pattern.bridge.model.color.Color;
import ru.adm123.pattern.bridge.model.color.ColorBlack;
import ru.adm123.pattern.bridge.model.color.ColorWhite;
import ru.adm123.pattern.bridge.model.shape.Shape;
import ru.adm123.pattern.bridge.model.shape.ShapeCircle;
import ru.adm123.pattern.bridge.model.shape.ShapeRect;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
public class Demo {

    private static final ShapeRect shapeRect = new ShapeRect();
    private static final ShapeCircle shapeCircle = new ShapeCircle();
    private static final ColorBlack colorBlack = new ColorBlack();
    private static final ColorWhite colorWhite = new ColorWhite();

    public static void main(String[] args) {
        useMethodsOut();
        useMethodsIn();
    }

    /**
     * Реализация bridge-а, предоставляющая "прямой доступ" к методам соединяемых интерфейсов
     */
    private static void useMethodsOut() {
        class Figure extends FigureMethodGetter {
            public Figure(@NonNull Shape shape, @NonNull Color color) {
                super(shape, color);
            }
        }
        Figure blackRect = new Figure(shapeRect, colorBlack);
        Figure whiteRect = new Figure(shapeRect, colorWhite);
        Figure blackCircle = new Figure(shapeCircle, colorBlack);
        Figure whiteCircle = new Figure(shapeCircle, colorWhite);
        System.out.println("================= useMethodsOut =================");
        System.out.println("blackRect: shape = " + blackRect.getShapeName() + ", color = " + blackRect.getColorName() + "");
        System.out.println("whiteRect: shape = " + whiteRect.getShapeName() + ", color = " + whiteRect.getColorName() + "");
        System.out.println("blackCircle: shape = " + blackCircle.getShapeName() + ", color = " + blackCircle.getColorName() + "");
        System.out.println("whiteCircle: shape = " + whiteCircle.getShapeName() + ", color = " + whiteCircle.getColorName() + "");
        System.out.println("================= useMethodsOut =================");
    }

    /**
     * Реализация bridge-а, использующая методы соединяемых интерфейсов во внутренней реализации
     */
    private static void useMethodsIn() {
        class Figure extends FigureMethodUser {
            public Figure(@NonNull Shape shape, @NonNull Color color) {
                super(shape, color);
            }
        }
        Figure blackRect = new Figure(shapeRect, colorBlack);
        Figure whiteRect = new Figure(shapeRect, colorWhite);
        Figure blackCircle = new Figure(shapeCircle, colorBlack);
        Figure whiteCircle = new Figure(shapeCircle, colorWhite);
        System.out.println("================= useMethodsIn ==================");
        blackRect.drawFigure();
        whiteRect.drawFigure();
        blackCircle.drawFigure();
        whiteCircle.drawFigure();
        System.out.println("================= useMethodsIn ==================");
    }

}
