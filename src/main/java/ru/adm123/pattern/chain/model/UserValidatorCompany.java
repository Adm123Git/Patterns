package ru.adm123.pattern.chain.model;

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
                user.getValidationResult().add("user not \"OurSuperCompany\" employee");
            }
        }
        return userValidator == null ? user : userValidator.validate(user);
    }

}
