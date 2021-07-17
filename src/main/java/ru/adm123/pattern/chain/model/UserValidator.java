package ru.adm123.pattern.chain.model;

/**
 * @author Dmitry Ushakov 17.07.2021
 */
public interface UserValidator {

    User validate(User user);

}
