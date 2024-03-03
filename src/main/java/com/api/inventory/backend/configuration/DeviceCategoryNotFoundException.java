package com.api.inventory.backend.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DeviceCategoryNotFoundException extends RuntimeException {
    public DeviceCategoryNotFoundException(String message) {
        super("Device Category Not Found Exception: ==>" + message);
    }
}
