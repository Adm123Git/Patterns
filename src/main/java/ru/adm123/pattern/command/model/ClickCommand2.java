package ru.adm123.pattern.command.model;

/**
 * @author Dmitry Ushakov at 18.07.2021
 * Имплементация команды клика - вариант 2
 */
public class ClickCommand2 implements ClickCommand {

    @Override
    public void executeClick() {
        System.out.println("click2 command execute");
    }

}
