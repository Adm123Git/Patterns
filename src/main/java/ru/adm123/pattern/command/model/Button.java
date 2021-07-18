package ru.adm123.pattern.command.model;

import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Dmitry Ushakov at 18.07.2021
 */
@Setter
@NoArgsConstructor
public class Button {

    private ClickCommand clickCommand;

    public void onClick() {
        if (clickCommand != null) {
            clickCommand.executeClick();
        }
    }

}
