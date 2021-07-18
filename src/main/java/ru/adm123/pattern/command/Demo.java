package ru.adm123.pattern.command;

import ru.adm123.pattern.command.model.Button;
import ru.adm123.pattern.command.model.ClickCommand;
import ru.adm123.pattern.command.model.ClickCommand1;
import ru.adm123.pattern.command.model.ClickCommand2;

/**
 * @author Dmitry Ushakov at 18.07.2021
 */
public class Demo {

    public static void main(String[] args) {
        Button button = new Button();
        ClickCommand clickCommand1 = new ClickCommand1();
        ClickCommand clickCommand2 = new ClickCommand2();
        // Ставим в качестве реакции на клик выполнение команды, реализованной в классе ClickCommand1
        button.setClickCommand(clickCommand1);
        // Клик по кнопке
        button.onClick();
        // Ставим в качестве реакции на клик выполнение команды, реализованной в классе ClickCommand2
        button.setClickCommand(clickCommand2);
        // Клик по кнопке
        button.onClick();
    }

}
