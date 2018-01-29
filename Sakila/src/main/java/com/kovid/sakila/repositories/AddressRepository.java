/**
 * 
 */
package com.kovid.sakila.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kovid.sakila.entities.Address;

/**
 * @author pkumar
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	public List<Address> findAddressByCityCityId(int cityId);
}
