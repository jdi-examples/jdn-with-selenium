package io.github.epam.tests.example;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import static io.github.jditesting.pages.JdiTestingGithubSite.*;
import static java.lang.Runtime.*;
import static jdisite.utils.DriverUtils.*;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        runChromeDriver();
        DRIVER.navigate().to(homePage.URL);
    }
    @AfterSuite(alwaysRun = true)
    static void teardown() throws IOException {
        getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
