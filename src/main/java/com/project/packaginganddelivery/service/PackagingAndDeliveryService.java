package com.project.packaginganddelivery.service;

import org.springframework.stereotype.Service;

import com.project.packaginganddelivery.exception.ComponentTypeNotFoundException;

@Service
public class PackagingAndDeliveryService {
    private static final double PROTECTIVE_SHEATH = 50;
    private static final double PACKAGING_AND_DELIVERY_ACCESSORY = 150;
    private static final double PACKAGING_AND_DELIVERY_INTEGRAL = 300;

    public double getCharge(String componentType, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("count must be greater than zero");
        }

        if (componentType.equalsIgnoreCase("accessory")) {
            return (PACKAGING_AND_DELIVERY_ACCESSORY + PROTECTIVE_SHEATH) * quantity;
        } else if (componentType.equalsIgnoreCase("integral"))
            return (PACKAGING_AND_DELIVERY_INTEGRAL + PROTECTIVE_SHEATH) * quantity;
        else
            throw new ComponentTypeNotFoundException("There is no delivery charge with this component type");
    }
}

