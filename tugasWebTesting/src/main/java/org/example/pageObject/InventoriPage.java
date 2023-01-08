package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoriPage {

    public static WebDriver driver;

    public InventoriPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basketItem1;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basketItem2;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(xpath = "//span[.='Products']")
    private WebElement displayLandingPage;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cartButton;

    @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement displayCartPage1;

    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    private WebElement displayCartPage2;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeButton;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinue;

    @FindBy(xpath = "//span[.='Checkout: Overview']")
    private WebElement displayDesc;

    @FindBy(xpath = "//div[@class='summary_info']")
    private WebElement displaySummary;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement buttonFinish;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement thnkuMsg;


    public void clickBasket1(){
        basketItem1.click();
    }

    public void clickBasket2(){
        basketItem2.click();
    }

    public void selectProductContainer(String sortProductList){
        Select b = new Select(selectContainer);
        b.selectByVisibleText(sortProductList);
    }

    public boolean displayLandingPage(){
        return displayLandingPage.isDisplayed();
    }

    public void clickCart(){
        cartButton.click();
    }

    public boolean displayCartPage1() {
        return displayCartPage1.isDisplayed();
    }
    public boolean displayCartPage2() {
        return displayCartPage2.isDisplayed();
    }
    public void removeItem(){
        removeButton.click();
    }

    public void checkoutCart(){
        checkoutButton.click();
    }

    public void setFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void setLastName(String lname) {
        lastName.sendKeys(lname);
    }

    public void setPostal(String postal) {
        zipCode.sendKeys(postal);
    }

    public void clickContinue(){
        buttonContinue.click();
    }

    public boolean displayDescPage() {
        return displayDesc.isDisplayed();
    }

    public boolean displayTotal() {
        return displaySummary.isDisplayed();
    }

    public void clickFinish(){
        buttonFinish.click();
    }

    public String getThnkUText(){
        return thnkuMsg.getText();
    }

}