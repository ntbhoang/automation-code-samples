package auto.samples.pages.login_page;

import auto.samples.pages.inventory_page.InventoryPage;
import auto.samples.webdriver_factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private LoginWebElements elements;

    public LoginPage(){
        this.elements = new LoginWebElements();
    }

    public LoginPage enterUserName(String userName){
        this.elements.userNameTextBox.sendKeys(userName);
        return this;
    }

    public LoginPage enterPassword(String password){
        this.elements.passwordTextBox.sendKeys(password);
        return this;
    }

    public InventoryPage clickLoginButton(){
        this.elements.loginButton.click();
        return new InventoryPage();
    }

}
