package com.empmgmt.addressservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.empmgmt.addressservice.DTO.AddressDTO;
import com.empmgmt.addressservice.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;

	@GetMapping("/address")
	public String getAddress() {
		return "My address is semriya Pandri Tehsil Multai Madhya Pradesh Betul";

	}

	@GetMapping("/address/{empId}")
	public ResponseEntity<AddressDTO> getEmpAddress(@PathVariable("empId") int empId) {
		AddressDTO addressDTO = addressService.getAddressDetails(empId);
		return ResponseEntity.status(HttpStatus.OK).body(addressDTO);

	}
}
