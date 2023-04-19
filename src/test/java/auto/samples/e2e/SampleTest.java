package auto.samples.e2e;

import auto.samples.BaseTest;
import auto.samples.actions.Navigate;
import auto.samples.pages.inventory_page.InventoryPage;
import auto.samples.pages.login_page.LoginPage;
import auto.samples.webdriver_factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.in;

public class SampleTest extends BaseTest {

    //LoginPage loginPage = new LoginPage(driver);

    @Test
    public void testLogin(){
        // LoginPage loginPage = new LoginPage();
        driver.get("https://www.saucedemo.com/");
//        InventoryPage inventoryPage = loginPage.enterUserName("standard_user").
//                enterPassword("secret_sauce").
//                clickLoginButton();

//        new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(15)).
//                until(ExpectedConditions.visibilityOf(inventoryPage.getElements().inventoryItemsList));

        //assertThat(inventoryPage.getElements().inventoryItemsList.isDisplayed()).isTrue();
    }
}