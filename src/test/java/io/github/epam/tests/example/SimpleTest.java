package io.github.epam.tests.example;

import org.testng.annotations.Test;

import static io.github.epam.tests.example.data.TestData.*;
import static io.github.jditesting.pages.JdiSiteUtils.*;
import static io.github.jditesting.pages.JdiTestingGithubSite.*;
import static jdisite.enums.MenuOptions.*;
import static jdisite.utils.DriverUtils.*;
import static org.testng.Assert.*;

public class SimpleTest implements TestsInit {
    @Test
    public void loginTest() {
        DRIVER.navigate().to(homePage.URL);
        homePage.userIcon.click();
        loginAs(DEFAULT_USER);
        assertEquals(DRIVER.getCurrentUrl(), homePage.URL);
        assertEquals(DRIVER.getTitle(), homePage.TITLE);
        selectInMenu(ContactForm);
        assertEquals(DRIVER.getCurrentUrl(), contactPage.URL);
        assertEquals(DRIVER.getTitle(), contactPage.TITLE);
        contactsSubmit(FULL_CONTACT);
        conatctsValidate(FULL_CONTACT);
    }
}
