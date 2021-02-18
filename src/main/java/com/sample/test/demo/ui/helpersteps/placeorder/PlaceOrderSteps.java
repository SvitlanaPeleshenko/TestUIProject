package com.sample.test.demo.ui.helpersteps.placeorder;

import com.sample.model.OrderInformation;
import com.sample.model.PickupInformation;
import com.sample.test.demo.ui.pages.placeorderform.PlaceOrderPage;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlaceOrderSteps {

    private final PlaceOrderPage orderPage;

    public void fillOrderInformation(OrderInformation orderInfo) {
        if (orderInfo.getPizzaType() != null) {
            orderPage.selectPizzaType(orderInfo.getPizzaType());
        }
        if (orderInfo.getPizzaTopping1() != null) {
            orderPage.selectPizzaTopping1(orderInfo.getPizzaTopping1());
        }
        if (orderInfo.getPizzaTopping2() != null) {
            orderPage.selectPizzaTopping2(orderInfo.getPizzaTopping2());
        }
        orderPage.setQuantity(String.valueOf(orderInfo.getQuantity()));

    }

    public void fillPickupInformation(PickupInformation pickupInfo) {
        if (pickupInfo.getPhoneNumber() != null) {
            orderPage.setPhoneNumber(pickupInfo.getPhoneNumber());
        }
        if (pickupInfo.getName() != null) {
            orderPage.setName(pickupInfo.getName());
        }
        if (pickupInfo.getEmail() != null) {
            orderPage.setEmail(pickupInfo.getEmail());
        }
    }

}
