package com.project.packaginganddelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.packaginganddelivery.service.PackagingAndDeliveryService;

@RestController
@RequestMapping("/packagingAndDelivery")
public class PackagingAndDeliveryController {

    public PackagingAndDeliveryService packagingAndDeliveryService;

    @Autowired
    public PackagingAndDeliveryController(PackagingAndDeliveryService packagingAndDeliveryService) {
        this.packagingAndDeliveryService = packagingAndDeliveryService;
    }

    @GetMapping("/GetPackagingAndDeliveryCharge/{componentType}/{quantity}")
    public double getPackagingAndDeliveryCharge(@PathVariable String componentType, @PathVariable int quantity) {
        return packagingAndDeliveryService.getCharge(componentType, quantity);
    }
}
