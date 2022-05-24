package com.project.packaginganddelivery;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.packaginganddelivery.service.PackagingAndDeliveryService;

@SpringBootTest
public class PackagingAndDeliveryServiceTest {
	
	@Autowired
	private PackagingAndDeliveryService service;

	@Test
	public void getChargeAccessoryTest() {
		double charge=service.getCharge("accessory", 3);
		assertEquals(600.0,charge);
	}
	
	@Test
	public void getChargeIntegralTest() {
		double charge=service.getCharge("integral", 2);
		assertEquals(700.0,charge);
	}
}
