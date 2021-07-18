package ru.adm123.pattern.command.model;

/**
 * @author Dmitry Ushakov at 18.07.2021
 * Имплементация команды клика - вариант 1
 */
public class ClickCommand1 implements ClickCommand {

    @Override
    public void executeClick() {
        System.out.println("click1 command execute");
    }

}
