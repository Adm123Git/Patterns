package ru.adm123.pattern.bridge.model.shape;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
public class ShapeCircle implements Shape {

    @Override
    @NonNull
    public String getShapeName() {
        return "circle";
    }

}
