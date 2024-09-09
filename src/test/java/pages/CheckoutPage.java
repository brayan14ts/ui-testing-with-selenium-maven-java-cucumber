package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

public class CheckoutPage {
    private final WebDriver driver;

    // datos manuales
    String dniNumber = "12345678";
    String street = "123 Elm Street";
    String city = "Springfield";
    String postCode = "1245";
    String phoneNumber = "1122002020";

    // Localizadores
    private By dniLocator = By.name("dni_number");
    private By streetLocator = By.id("street1");
    private By cityLocator = By.id("city");
    private By postCodeLocator = By.id("postcode");
    private By phoneLocator = By.id("telephone");
    private By saveLocator = By.xpath("//span[text()='Continuar con método de envío']");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos de interacción

    public void enterPersonalData() {
    WebElement dniElement = driver.findElement(dniLocator);
    WebElement streetElement = driver.findElement(streetLocator);
    WebElement cityElement = driver.findElement(cityLocator);
    WebElement postCodeElement = driver.findElement(postCodeLocator);
    WebElement phoneElement = driver.findElement(phoneLocator);

    dniElement.sendKeys(dniNumber);
    streetElement.sendKeys(street);
    cityElement.sendKeys(city);
    postCodeElement.sendKeys(postCode);
    phoneElement.sendKeys(phoneNumber);
}
    //clic en boton GUARDAR
    public void clickSaveButton() {
        WebElement saveButton = driver.findElement(saveLocator);
        saveButton.click();
    }
}
