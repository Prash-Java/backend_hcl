package com.api.inventory.backend.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DeviceManagerNotFoundException extends RuntimeException {
    DeviceManagerNotFoundException(String message) {
        super("Device Manager Is Not Found: ==> " + message);
    }
}
