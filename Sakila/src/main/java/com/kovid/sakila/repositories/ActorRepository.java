/**
 * 
 */
package com.kovid.sakila.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kovid.sakila.entities.Actor;

/**
 * @author pkumar
 *
 */
//public interface ActorRepository extends CrudRepository<Actor, Integer> {
@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
	public List<Actor> findByFirstName(String firstName);
}
