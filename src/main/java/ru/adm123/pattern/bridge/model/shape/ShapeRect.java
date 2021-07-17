package ru.adm123.pattern.bridge.model.shape;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
public class ShapeRect implements Shape {

    @Override
    @NonNull
    public String getShapeName() {
        return "rectangle";
    }

}
