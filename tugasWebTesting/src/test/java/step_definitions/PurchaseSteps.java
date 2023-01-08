package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.InventoriPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User pick item Sauce Labs Onesie")
    public void clickItemBasket1() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket1();
        Thread.sleep(2000);
    }

    @And("User pick item Test.allTheThings T-Shirt Red")
    public void clickItemBasket2() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket2();
        Thread.sleep(2000);
    }

    @When("User sort product list by name z to a")
    public void selectProductContainer() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String a = "Name (Z to A)";
        inventoriPage.selectProductContainer(a);
        Thread.sleep(2000);
    }


    @Then("User already in landing page")
    public void verifyLandingPage() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayLandingPage());
        Thread.sleep(2000);
    }

    @And("User click cart")
    public void clickCart() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickCart();
        Thread.sleep(2000);
    }

    @And("Verify item is added")
    public void verifyCartPage() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayCartPage1());
        Assert.assertTrue(inventoriPage.displayCartPage2());
        Thread.sleep(2000);
    }

    @And("User remove item Test.allTheThings T-Shirt Red")
    public void removeItem() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.removeItem();
        Thread.sleep(5000);
    }

    @And("User click Checkout button on Cart Page")
    public void buttonCheckOut() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.checkoutCart();
        Thread.sleep(5000);
    }

    // edit dari sini
    @When("User input \"(.*)\" as firstName and input \"(.*)\" as lastName and input \"(.*)\" as zipCode")
    public void inputAddress(String firstName, String lastName, String zipCode) {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.setFirstName(firstName);
        inventoriPage.setLastName(lastName);
        inventoriPage.setPostal(zipCode);
        inventoriPage.clickContinue();
    }

    @And("System showing summary of payment")
    public void checkoutOverview() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayDescPage());
        Assert.assertTrue(inventoriPage.displayTotal());
        Thread.sleep(2000);
    }

    @And("User click finish button")
    public void clickFinish() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickFinish();
        Thread.sleep(2000);
    }

    @Then("System showing messages \"(.*)\"")
    public void errorText(String thankUText) throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertEquals(thankUText, inventoriPage.getThnkUText());
        Thread.sleep(2000);
        System.out.println(thankUText);
    }


}

