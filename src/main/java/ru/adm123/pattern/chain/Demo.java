package ru.adm123.pattern.chain;

import ru.adm123.pattern.chain.model.*;

import javax.xml.validation.Validator;

/**
 * @author Dmitry Ushakov 17.07.2021
 */
public class Demo {

    public static void main(String[] args) {
        User user = new User(1, 16, "Mike", "TheirCompany");
        System.out.println("----- without chain ----------");
        checkWithoutChain(user);
        System.out.println(user.getValidationResult());
        System.out.println("------- with chain -----------");
        user.getValidationResult().clear();
        checkWithChain(user);
        System.out.println(user.getValidationResult());
    }

    private static void checkWithoutChain(User user) {
        if (user == null) {
            System.out.println("User is null");
            return;
        }
        if (user.getId() < 1) {
            user.getValidationResult().add("user not registered");
            return;
        }
        if (!"OurSuperCompany".equals(user.getCompany())) {
            user.getValidationResult().add("user not \"OurSuperCompany\" employee");
            return;
        }
        if (user.getAge() < 18) {
            user.getValidationResult().add("user too young");
            return;
        }
        if (user.getName() == null || user.getName().trim().length() < 3) {
            user.getValidationResult().add("name too short");
            return;
        }
    }

    private static void checkWithChain(User user) {
        new UserValidatorId(
                new UserValidatorCompany(
                        new UserValidatorAge(
                                new UserValidatorNameLength(null)
                        )))
                .validate(user);
    }

}
