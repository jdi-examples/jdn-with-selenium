package io.github.jditesting.pages;

import io.github.jditesting.entities.Contacts;
import io.github.jditesting.entities.Logins;
import io.github.jditesting.sections.ContactForm;
import jdisite.enums.MenuOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static io.github.jditesting.pages.JdiTestingGithubSite.*;
import static java.lang.String.*;
import static jdisite.utils.DriverUtils.*;
import static org.testng.Assert.*;

public class JdiSiteUtils {
    public static void loginAs(Logins user) {
        if (user.name != null) {
            loginForm.name.clear();
            loginForm.name.sendKeys(user.name);
        }
        if (user.password != null) {
            loginForm.password.clear();
            loginForm.password.sendKeys(user.password);
        }
        loginForm.loginButton.click();
    }

    public static void contactsSubmit(Contacts contact) {
        ContactForm form = contactForm;
        if (contact.name != null) {
            form.name.clear();
            form.name.sendKeys(contact.name);
        }
        if (contact.lastName != null) {
            form.lastName.clear();
            form.lastName.sendKeys(contact.lastName);
        }
        if (contact.position != null) {
            form.position.clear();
            form.position.sendKeys(contact.position);
        }
        if (contact.passportNumber != null) {
            form.passportNumber.clear();
            form.passportNumber.sendKeys(valueOf(contact.passportNumber));
        }
        if (contact.passportSeria != null) {
            form.passportSeria.clear();
            form.passportSeria.sendKeys(valueOf(contact.passportSeria));
        }
        // Dropdown
        if (contact.gender != null) {
            Select genderSelect = new Select(form.gender);
            genderSelect.selectByVisibleText(contact.gender);
        }
        // Checkboxes
        if (contact.passport.equals("true") && !form.passport.isSelected() ||
                contact.passport.equals("false") && form.passport.isSelected())
            form.passport.click();
        if (contact.acceptConditions.equals("true") && !form.acceptConditions.isSelected() ||
                !contact.acceptConditions.equals("false") && form.acceptConditions.isSelected())
            form.acceptConditions.click();
        // TextArea
        if (contact.description != null) {
            form.description.clear();
            form.description.sendKeys(contact.description);
        }
        form.submit.click();
    }
    public static void conatctsValidate(Contacts contact) {
        ContactForm form = contactForm;
        // TextFields
        if (contact.name != null)
            assertEquals(form.name.getAttribute("value"), contact.name);
        if (contact.lastName != null)
            assertEquals(form.lastName.getAttribute("value"), contact.lastName);
        if (contact.position != null)
            assertEquals(form.position.getAttribute("value"), contact.position);
        if (contact.passportNumber != null)
            assertEquals(form.passportNumber.getAttribute("value"), valueOf(contact.passportNumber));
        if (contact.passportSeria != null)
            assertEquals(form.passportSeria.getAttribute("value"), valueOf(contact.passportSeria));
        // Dropdown
        if (contact.gender != null) {
            Select genderSelect = new Select(form.gender);
            assertEquals(genderSelect.getFirstSelectedOption().getText(), contact.gender);
        }
        // Checkboxes
        assertEquals(form.passport.isSelected() ? "true" : "false", contact.passport);
        assertEquals(form.acceptConditions.isSelected() ? "true" : "false", contact.acceptConditions);
        // TextArea
        if (contact.description != null)
            assertEquals(form.description.getAttribute("value"), contact.description);
    }
    public static void selectInMenu(MenuOptions value) {
        DRIVER.findElement(By.xpath("//*[contains(@class, 'sidebar-menu')]//span[.='"+value.value+"']"))
                .click();
    }
}
