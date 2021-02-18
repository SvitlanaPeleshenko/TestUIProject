package com.sample.test.placeorder;

import static org.assertj.core.api.Assertions.assertThat;

import com.sample.test.demo.TestBase;
import org.testng.annotations.Test;

public class NamePhoneFieldsValidationTest extends TestBase {

    @Test(description = "Check validation for Name, Phone fields.")
    public void namePhoneFieldsValidationTest() {
        final String NAME = "Ann";

        placeOrderPage.setName(NAME);
        placeOrderPage.clickOnPlaceOrderButton();

        assertThat(placeOrderPage.getConfirmationPopup()
                .isDisplayed())
                .isTrue()
                .withFailMessage("Notification popup " +
                "is not displayed");

        assertThat(placeOrderPage.getConfirmationPopup().getText())
                .isEqualTo("Missing phone number")
                .withFailMessage("Notification message is %s, but should be %s ",
                placeOrderPage.getConfirmationPopup().getText(), "Missing phone number");
    }

}
