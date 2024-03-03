package com.api.inventory.backend.service;

import com.api.inventory.backend.entity.DeviceManagerEntity;

import java.util.List;

public interface DeviceManagerService {
    // Save Device Manager
    DeviceManagerEntity saveDeviceManager(DeviceManagerEntity deviceManagerEntity);
    // Read All Device Managers
    List<DeviceManagerEntity> getAllDeviceManagers();
    // Read Specific Device Manager
    DeviceManagerEntity getDeviceManagerById(Long id);
    // Delete Specific Device Manager
    void deleteDeviceManagerById(Long id);
    // Update Specific Device Manager
    DeviceManagerEntity updateDeviceManagerById(DeviceManagerEntity deviceManagerEntity, Long id);

}
