package ru.adm123.pattern.bridge.model.shape;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
public interface Shape {

    @NonNull
    String getShapeName();

}
