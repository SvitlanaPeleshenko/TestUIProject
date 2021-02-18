package com.sample.test.placeorder;

import static org.assertj.core.api.Assertions.assertThat;

import com.sample.model.OrderInformation;
import com.sample.model.PickupInformation;
import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import com.sample.test.demo.ui.helpersteps.placeorder.PlaceOrderSteps;
import org.testng.annotations.Test;

public class PlaceOrderTest extends TestBase {

    private final OrderInformation orderInfo =
            OrderInformation.builder()
                    .pizzaType(PizzaTypes.MEDIUM_TWOTOPPINGS)
                    .pizzaTopping1(PizzaToppings.MUSHROOMS)
                    .pizzaTopping2(PizzaToppings.OLIVES)
                    .quantity(1)
                    .build();

    private final PickupInformation pickupInfo =
            PickupInformation.builder()
                    .name("Ann")
                    .email("start@gmail.com")
                    .phoneNumber("44444444")
                    .build();

    @Test(description = "Check success place order.")
    public void placeOrderWithFullInfoTest() {
        PlaceOrderSteps placeOrderSteps = new PlaceOrderSteps(placeOrderPage);
        placeOrderSteps.fillOrderInformation(orderInfo);
        placeOrderSteps.fillPickupInformation(pickupInfo);
        placeOrderPage.selectRadioCash();
        String calculatedSum = placeOrderPage.getCostValue();
        placeOrderPage.clickOnPlaceOrderButton();

        assertThat(placeOrderPage.getConfirmationPopup().isDisplayed())
                .isTrue()
                .withFailMessage("Notification popup " +
                        "is not displayed");

        String expectedNotifications =
                String.format("Thank you for your order! TOTAL: %s %s",
                        calculatedSum,
                        orderInfo.getPizzaType()
                                .getDisplayName());
        assertThat(placeOrderPage.getConfirmationPopupMessage().getText())
                .contains(expectedNotifications)
                .withFailMessage("Notification message is not correct.");
    }

}
