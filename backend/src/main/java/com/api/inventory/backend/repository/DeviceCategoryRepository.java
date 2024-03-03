package com.api.inventory.backend.repository;

import com.api.inventory.backend.entity.DeviceCategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface DeviceCategoryRepository extends CrudRepository<DeviceCategoryEntity, Long> {
}
