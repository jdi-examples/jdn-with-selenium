package io.github.jditesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public final String URL = "https://jdi-testing.github.io/jdi-light/index.html";
    public final String TITLE = "Home Page";

    @FindBy(id ="user-icon") public WebElement userIcon;
    @FindBy(id ="user-name") public WebElement userName;
    @FindBy(css = ".fa-sign-out") public WebElement logout;
}
