package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;

    // Localizadores
    private By emailLocator = By.xpath("//label[text()='Dirección de correo electrónico *']/following::input");
    private By passwordLocator = By.name("password");
    private By loginButton = By.xpath("//span[text()='Iniciar sesión']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos de interacción
    public void enterUsername(String username) {
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }
}
