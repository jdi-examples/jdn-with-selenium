package io.github.epam.tests.example.data;

import io.github.jditesting.entities.Contacts;
import io.github.jditesting.entities.Logins;

public class TestData {
    public static Logins DEFAULT_USER = new Logins().setName("Roman").setPassword("Jdi1234");
    public static Contacts SIMPLE_CONTACT = new Contacts()
            .setName("Roman").setLastName("Iovlev").setPosition("ChiefQA")
            .setPassportNumber("4321").setPassportSeria("123456")
            .setDescription("JDI - awesome UI autoamtion tool");

    public static Contacts FULL_CONTACT = new Contacts(
            "Roman", "Full Contact", "ChiefQA","Female", "Other",
            "Sun, Snow","JDI - awesome UI automation tool",
            "4321", "123456", "true", "false"
    );

}
