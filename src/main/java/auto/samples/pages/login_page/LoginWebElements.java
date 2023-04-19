package auto.samples.pages.login_page;

import auto.samples.webdriver_factory.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWebElements {

    WebElement userNameTextBox = WebDriverFactory.driver.findElement(By.cssSelector("#user-name"));
    WebElement passwordTextBox = WebDriverFactory.driver.findElement(By.cssSelector("#password"));
    WebElement loginButton = WebDriverFactory.driver.findElement(By.cssSelector("#login-button"));
}
