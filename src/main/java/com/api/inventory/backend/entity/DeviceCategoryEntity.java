package com.api.inventory.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "device_category")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class DeviceCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "device_category_id")
    private long deviceCategoryId;
    @Column(name = "device_category_name", nullable = false, unique = true, length = 500)
    private String deviceCategoryName;
    @Column(name = "device_category_description", nullable = false, unique = true, length = 500)
    private String deviceCategoryDescription;
}
