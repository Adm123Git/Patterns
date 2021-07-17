package ru.adm123.pattern.chain.model;

/**
 * @author Dmitry Ushakov 17.07.2021
 */
public class UserValidatorNameLength implements UserValidator {

    private final UserValidator userValidator;

    public UserValidatorNameLength(UserValidator userValidator) {
        this.userValidator = userValidator;
    }

    @Override
    public User validate(User user) {
        if (user != null) {
            if (user.getName() == null || user.getName().trim().length() < 3) {
                user.getValidationResult().add("name too short");
            }
        }
        return userValidator == null ? user : userValidator.validate(user);
    }

}
