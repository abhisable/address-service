package com.empmgmt.addressservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmgmt.addressservice.DTO.AddressDTO;
import com.empmgmt.addressservice.entity.AddressEntity;
import com.empmgmt.addressservice.repository.AddressRepository;

@Service 
public class AddressService {

	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public AddressDTO getAddressDetails(int employeeId) {
		AddressEntity addressEntity=addressRepository.findAddressByEmployeeId(employeeId);
		AddressDTO addressDTO=modelMapper.map(addressEntity,AddressDTO.class);
		return addressDTO;
	}
}
