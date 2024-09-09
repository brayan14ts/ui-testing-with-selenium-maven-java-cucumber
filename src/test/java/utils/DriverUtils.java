package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverUtils {

    private static WebDriver driver;
    private static Properties properties = new Properties();

    static {
        // Cargar propiedades
        try (FileInputStream fis = new FileInputStream("src/test/resources/test.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            // Configurar WebDriver
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void navigateToLoginPage() {
        WebDriver driver = getDriver();
        driver.get(properties.getProperty("login.url"));
        driver.manage().window().maximize(); // Opcional
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // Método para tomar captura de pantalla
    public static void takeScreenshot(String fileName) {
        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
        File screenshot = screenshotDriver.getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
