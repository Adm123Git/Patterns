package ru.adm123.pattern.chainResponsibility.model;

/**
 * @author Dmitry Ushakov 17.07.2021
 */
public class UserValidatorAge implements UserValidator {

    private final UserValidator userValidator;

    public UserValidatorAge(UserValidator userValidator) {
        this.userValidator = userValidator;
    }

    @Override
    public User validate(User user) {
        if (user != null) {
            if (user.getAge() < 18) {
                System.out.println("user too young");
                return user;
            }
        }
        return userValidator == null ? user : userValidator.validate(user);
    }

}
