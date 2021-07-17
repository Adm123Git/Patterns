package ru.adm123.pattern.bridge.model.color;

import lombok.NonNull;

/**
 * @author Dmitry Ushakov on 15.07.21
 */
public class ColorBlack implements Color {

    @Override
    @NonNull
    public String getColorName() {
        return "black";
    }

}
