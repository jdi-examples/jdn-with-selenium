package io.github.jditesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
    public final String URL = "https://jdi-testing.github.io/jdi-light/contacts.html";
    public final String TITLE = "Contact Form";

    @FindBy(css ="#contact-form #name") public WebElement name;
    @FindBy(id = "last-name") public WebElement lastName;
    @FindBy(id = "position") public WebElement position;
    @FindBy(id = "passport-number") public WebElement passportNumber;
    @FindBy(id = "passport-seria") public WebElement passportSeria;
    // Dropdown
    @FindBy(id = "gender") public WebElement gender;
    @FindBy(id = "accept-conditions") public WebElement acceptConditions;
    @FindBy(id = "passport") public WebElement passport;
    @FindBy(id = "description") public WebElement description;
    @FindBy(css ="#contact-form [type=submit]") public WebElement submit;
}
