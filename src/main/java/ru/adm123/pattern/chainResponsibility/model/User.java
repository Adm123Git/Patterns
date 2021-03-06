package ru.adm123.pattern.chainResponsibility.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Ushakov 17.07.2021
 * Класс, который нужно в разных местах программы валидировать по разным условиям
 */
@Getter
@Setter
@AllArgsConstructor
public class User {

    private int id;
    private int age;
    private String name;
    private String company;

}
