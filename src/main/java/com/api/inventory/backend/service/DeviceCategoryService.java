package com.api.inventory.backend.service;

import com.api.inventory.backend.entity.DeviceCategoryEntity;

import java.util.List;
import java.util.Optional;

public interface DeviceCategoryService {
    // Save Device Category
    DeviceCategoryEntity saveDeviceCategory(DeviceCategoryEntity deviceCategoryEntity);
    // Read All Device Category
    List<DeviceCategoryEntity> getAllDeviceCategories();
    // Read Specific Device Category
    Optional<DeviceCategoryEntity> getDeviceCategoryById(Long id);
    // Update Device Category
    DeviceCategoryEntity updateDeviceCategoryById(DeviceCategoryEntity deviceCategoryEntity, Long id);
    // Delete Device Category
    void deleteDeviceCategoryById(Long id);
}
