package com.api.inventory.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "device_manager")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class DeviceManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "device_manager_id")
    private long deviceManagerId;
    @Column(name = "device_manager_name", nullable = false, length = 500)
    private String deviceManagerName;
    @Column(name = "device_manager_ldap_or_email", nullable = false, unique = true, length = 500)
    private String deviceManagerLdapOrEmail;
    @Column(name = "device_manager_mobile_number", nullable = true, length = 500)
    private String deviceManagerMobileNumber;
}
