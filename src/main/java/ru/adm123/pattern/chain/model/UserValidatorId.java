package ru.adm123.pattern.chain.model;

/**
 * @author Dmitry Ushakov 17.07.2021
 */
public class UserValidatorId implements UserValidator {

    private final UserValidator userValidator;

    public UserValidatorId(UserValidator userValidator) {
        this.userValidator = userValidator;
    }

    @Override
    public User validate(User user) {
        if (user != null) {
            if (user.getId() < 1) {
                user.getValidationResult().add("user not registered");
            }
        }
        return userValidator == null ? user : userValidator.validate(user);
    }

}
