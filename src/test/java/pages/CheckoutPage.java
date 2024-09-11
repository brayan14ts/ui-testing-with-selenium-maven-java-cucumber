package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class CheckoutPage {
    private final WebDriver driver;
    private static Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream("src/test/resources/test.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // datos manuales
    String dniNumber = DriverUtils.generateRandomNumber(8);
    //String postCode = "1414";
    String phoneNumber = DriverUtils.generateRandomNumber(10);

    // Localizadores
    private By dniLocator = By.name("dni_number");
    private By streetLocator = By.id("street1");
    private By streetAutocompletedLocator = By.xpath("//ul[@class='autocompleteMap-predictionList--LP']");
    private By cityLocator = By.id("city");
    //private By postCodeLocator = By.id("postcode");
    private By phoneLocator = By.id("telephone");
    private By saveLocator = By.xpath("//span[text()='guardar']");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos de interacción

    public void enterPersonalData() {
        DriverUtils.sleep(10000);
        WebElement dniElement = driver.findElement(dniLocator);
        WebElement streetElement = driver.findElement(streetLocator);
        WebElement streetAutocompletedElement = driver.findElement(streetAutocompletedLocator);
        WebElement cityElement = driver.findElement(cityLocator);
        //WebElement postCodeElement = driver.findElement(postCodeLocator);
        WebElement phoneElement = driver.findElement(phoneLocator);

        dniElement.sendKeys(dniNumber);

        String streetData = properties.getProperty("streetData");
        System.out.println("Datos de la calle: " + streetData);
        if (streetData != null && !streetData.isEmpty()) {
            streetElement.sendKeys(streetData);
        } else {
            System.out.println("El valor de streetData es nulo o vacío.");
        }

        streetElement.sendKeys(properties.getProperty("streetData"));
        DriverUtils.sleep(5000);
        streetAutocompletedElement.click();
        cityElement.sendKeys(properties.getProperty("cityData"));
        //postCodeElement.sendKeys(postCode);
        phoneElement.sendKeys(phoneNumber);
}
    //clic en boton GUARDAR
    public void clickSaveButton() {
        WebElement saveButton = driver.findElement(saveLocator);
        saveButton.click();
    }
}
