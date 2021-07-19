package ru.adm123.pattern.chainResponsibility;

import ru.adm123.pattern.chainResponsibility.model.*;

/**
 * @author Dmitry Ushakov 17.07.2021
 */
public class Demo {

    public static void main(String[] args) {
        User user = new User(1, 16, "Mike", "TheirCompany");
        System.out.println("----- without chain ----------");
        checkWithoutChain(user);
        System.out.println("------- with chain -----------");
        checkWithChain(user);
    }

    private static void checkWithoutChain(User user) {
        if (user == null) {
            System.out.println("User is null");
            return;
        }
        if (user.getId() < 1) {
            System.out.println("user not registered");
            return;
        }
        if (!"OurSuperCompany".equals(user.getCompany())) {
            System.out.println("user not \"OurSuperCompany\" employee");
            return;
        }
        if (user.getAge() < 18) {
            System.out.println("user too young");
            return;
        }
        if (user.getName() == null || user.getName().trim().length() < 3) {
            System.out.println("name too short");
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
