package com.sample.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PickupInformation {
    private String name;
    private String email;
    private String phoneNumber;
}

