package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.HomeAccountPage;
import utils.DriverUtils;

public class LoginSteps{

    private final WebDriver driver = DriverUtils.getDriver();
    private final LoginPage loginPage = new LoginPage(driver);

    @Given("que el usuario está en la página de inicio de sesión")
    public void givenUserIsOnLoginPage() {
        DriverUtils.navigateToLoginPage();
    }

    @When("el usuario ingresa el nombre de usuario y la contrasenia")
    public void whenUserEntersCredentials() {
        DriverUtils.sleep(5000);
        loginPage.enterUsername(DriverUtils.getProperty("username"));
        loginPage.enterPassword(DriverUtils.getProperty("password"));
        DriverUtils.takeScreenshot("credentialsEntered"); // Captura de pantalla después de ingresar credenciales
    }

    @And("hace clic en el botón de inicio sesión")
    public void andClicksOnButton() {
        loginPage.clickLoginButton();
    }

    @Then("el usuario debería ser redirigido al home del cliente")
    public void thenUserShouldBeRedirectedToHomePage() {
        String currentUrl = driver.getCurrentUrl();
        String homeUrl = DriverUtils.getProperty("homeclient.url");
        assert(currentUrl.equals(homeUrl));
        DriverUtils.takeScreenshot("homePage"); // Captura de pantalla en la página principal

    }

    @And("visualiza un mensaje de bienvenida que incluye la palabra {string}")
    public void andUserShouldSeeWelcomeMessage(String welcomeMessage) {
        assert(HomeAccountPage.isWelcomeMessageDisplayed(welcomeMessage));
    }

    //@After
    //public void afterScenario() {
    //     DriverUtils.quitDriver();
    //}
}