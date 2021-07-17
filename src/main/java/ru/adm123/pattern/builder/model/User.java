package ru.adm123.pattern.builder.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Dmitry Ushakov on 15.07.21<br>
 * Класс со множеством полей, объекты которого могут создаваться в разных местах и с разными полями, заданными на этапе создания объекта
 */
@Setter
@Getter
@ToString
public class User {

    private int id;
    private int age;
    private String name;
    private String organization;

    /**
     * Залочим конструктор, чтобы объекты класса создавались только билдером
     */
    private User() {
    }

    /**
     * Если у класса, который инстанцирует билдер, есть обязательные поля, то можно передать их значения
     * в конструктор билдера и создавать объект нужного класса в конструкторе билдера, а не определять заранее.
     */
    public static class Builder {

        private final User user = new User();

        public Builder id(int id) {
            user.id = id;
            return this;
        }

        public Builder age(int age) {
            user.age = age;
            return this;
        }

        public Builder name(String name) {
            user.name = name;
            return this;
        }

        public Builder organization(String organization) {
            user.organization = organization;
            return this;
        }

        @NonNull
        public User build() {
            return user;
        }

    }

}
