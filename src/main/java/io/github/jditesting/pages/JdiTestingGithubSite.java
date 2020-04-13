package io.github.jditesting.pages;

import io.github.jditesting.sections.ContactForm;
import io.github.jditesting.sections.LoginForm;

import static jdisite.utils.DriverUtils.*;
import static org.openqa.selenium.support.PageFactory.*;

public class JdiTestingGithubSite {
    public static HomePage homePage = initElements(DRIVER, HomePage.class);
    public static ContactPage contactPage = initElements(DRIVER, ContactPage.class);

    public static LoginForm loginForm = initElements(DRIVER, LoginForm.class);
    public static ContactForm contactForm = initElements(DRIVER, ContactForm.class);
}
