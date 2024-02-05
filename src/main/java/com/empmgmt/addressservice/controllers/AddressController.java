package com.empmgmt.addressservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	@GetMapping("/address")
	public String getAddress() {
		return "My address is semriya Pandri Tehsil Multai Madhya Pradesh Betul";

	}
}
