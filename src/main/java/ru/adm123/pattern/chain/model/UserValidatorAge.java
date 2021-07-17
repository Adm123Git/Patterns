package ru.adm123.pattern.chain.model;

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
                user.getValidationResult().add("user too young");
            }
        }
        return userValidator == null ? user : userValidator.validate(user);
    }

}
