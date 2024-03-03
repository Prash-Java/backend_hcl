package com.api.inventory.backend.repository;

import com.api.inventory.backend.entity.DeviceManagerEntity;
import org.springframework.data.repository.CrudRepository;

public interface DeviceManagerRepository extends CrudRepository<DeviceManagerEntity, Long> {
}
