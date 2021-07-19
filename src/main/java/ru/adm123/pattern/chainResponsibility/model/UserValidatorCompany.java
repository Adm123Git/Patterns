package ru.adm123.pattern.chainResponsibility.model;

/**
 * @author Dmitry Ushakov 17.07.2021
 */
public class UserValidatorCompany implements UserValidator {

    private final UserValidator userValidator;

    public UserValidatorCompany(UserValidator userValidator) {
        this.userValidator = userValidator;
    }

    @Override
    public User validate(User user) {
        if (user != null) {
            if (!"OurSuperCompany".equals(user.getCompany())) {
                System.out.println("user not \"OurSuperCompany\" employee");
                return user;
            }
        }
        return userValidator == null ? user : userValidator.validate(user);
    }

}
