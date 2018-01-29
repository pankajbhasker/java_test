package com.kovid.sakila.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kovid.sakila.entities.Address;
import com.kovid.sakila.repositories.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;
	
	public List<Address> getAllAddresses(){
		return addressRepository.findAll();
	}
	public List<Address> getAllAddressByCityId(int cityId){
		return addressRepository.findAddressByCityCityId(cityId);
	}
}
