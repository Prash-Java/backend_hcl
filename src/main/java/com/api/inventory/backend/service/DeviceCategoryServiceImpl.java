package com.api.inventory.backend.service;

import com.api.inventory.backend.configuration.DeviceCategoryNotFoundException;
import com.api.inventory.backend.entity.DeviceCategoryEntity;
import com.api.inventory.backend.repository.DeviceCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DeviceCategoryServiceImpl implements DeviceCategoryService {
    @Autowired
    private DeviceCategoryRepository deviceCategoryRepository;
    @Override
    public DeviceCategoryEntity saveDeviceCategory(DeviceCategoryEntity deviceCategoryEntity) {
        return deviceCategoryRepository.save(deviceCategoryEntity);
    }

    @Override
    public List<DeviceCategoryEntity> getAllDeviceCategories() {
        return (List<DeviceCategoryEntity>) deviceCategoryRepository.findAll();
    }

    @Override
    public Optional<DeviceCategoryEntity> getDeviceCategoryById(Long id) {
        return Optional.ofNullable(deviceCategoryRepository.findById(id)
                .orElseThrow(() -> new DeviceCategoryNotFoundException("Not Found")));
    }

    @Override
    public DeviceCategoryEntity updateDeviceCategoryById(DeviceCategoryEntity deviceCategoryEntity, Long id) {
        return null;
    }

    @Override
    public void deleteDeviceCategoryById(Long id) {
        deviceCategoryRepository.deleteById(id);
    }
}
