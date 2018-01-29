package com.kovid.sakila.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kovid.sakila.entities.Address;
import com.kovid.sakila.services.AddressService;

@RestController
@RequestMapping("address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	@GetMapping(value="all")
	public List<Address> getAllAddresses(){
		return addressService.getAllAddresses();
	}
	
	@GetMapping(value="city/{cityId}")
	public List<Address> getAllAddressByCityId(@PathVariable(value="cityId") int cityId){
		return addressService.getAllAddressByCityId(cityId);
	}
}
