package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.HomePage;
import utils.DriverUtils;

public class PurchaseSteps {
    private WebDriver driver = DriverUtils.getDriver();
    private HomePage homePage = new HomePage(driver);
    private CheckoutPage checkoutPage = new CheckoutPage(driver);


    @And("el usuario está en la pagina del {string}")
    public void theUserIsOnTheHomePage(String string) {
        homePage.clickOnHomeButton();
    }

    @And("agrega un producto al carrito")
    public void addOneProductToTheCart() {
    homePage.clickOnAProduct();
    homePage.clickOnAddACart();
    }

    @And("el usuario procede al checkout: datos personales: método de envío, método de pago")
    public void checkout() {
        homePage.clickGoToCheckout();
        //datos personales
        checkoutPage.enterPersonalData();
        checkoutPage.clickSaveButton();

        //metodo de envio


        //metodo de pago
    }




    //@After
    //public void afterScenario() {
    //    DriverUtils.quitDriver();
    //}

}