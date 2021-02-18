package com.sample.test.demo.ui.pages.placeorderform;

import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

@Getter
@Setter
public class PlaceOrderPage {

    private final String VALUE_ATTRIBUTE = "value";

    @FindBy(id = "pizza1Pizza")
    private WebElement pizzaTypeDropDown;

    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings1']")
    private WebElement pizzaTopping1DropDown;

    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings2']")
    private WebElement pizzaTopping2DropDown;

    @FindBy(id = "pizza1Qty")
    private WebElement pizzaQuantityInput;

    @FindBy(id = "pizza1Cost")
    private WebElement pizzaCostInput;

    //PICKUP INFORMATION
    @FindBy(id = "ccpayment")
    private WebElement radioCreditCard;

    @FindBy(id = "cashpayment")
    private WebElement radioCash;

    //PAYMENT INFORMATION
    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "phone")
    private WebElement phoneInput;

    @FindBy(id = "placeOrder")
    private WebElement placeOrderButton;

    @FindBy(id = "reset")
    private WebElement resetButton;

    //DIALOG
    @FindBy(id = "dialog")
    private WebElement confirmationPopup;

    @FindBy(xpath = "//div[@id='dialog']/p")
    private WebElement confirmationPopupMessage;

    public PlaceOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectPizzaType(PizzaTypes pizzaType) {
        Select pizzaSelect = new Select(getPizzaTypeDropDown());
        pizzaSelect.selectByValue(pizzaType.getDisplayName());
    }

    public void selectPizzaTopping1(PizzaToppings topping) {
        Select pizzaToppingSelect = new Select(getPizzaTopping1DropDown());
        pizzaToppingSelect.selectByValue(topping.getDisplayName());
    }

    public void selectPizzaTopping2(PizzaToppings topping) {
        Select pizzaToppingSelect = new Select(getPizzaTopping2DropDown());
        pizzaToppingSelect.selectByValue(topping.getDisplayName());
    }

    public void setQuantity(String quantity) {
        getPizzaQuantityInput().clear();
        getPizzaQuantityInput().sendKeys(quantity);
        getPizzaQuantityInput().click();
    }

    public void setEmail(String email) {
        getEmailInput().sendKeys(email);
    }

    public void setName(String name) {
        getNameInput().sendKeys(name);
    }

    public void setPhoneNumber(String phoneNumber) {
        getPhoneInput().sendKeys(phoneNumber);
    }

    public String getCostValue() {
        return getPizzaCostInput().getAttribute(VALUE_ATTRIBUTE);
    }

    public void selectRadioCreditCard() {
        getRadioCreditCard().click();
    }

    public void selectRadioCash() {
        getRadioCash().click();
    }

    public void clickOnPlaceOrderButton() {
        getPlaceOrderButton().click();
    }

    public void clickOnResetButton() {
        getResetButton().click();
    }

}
