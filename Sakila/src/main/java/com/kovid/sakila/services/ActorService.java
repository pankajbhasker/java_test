/**
 * 
 */
package com.kovid.sakila.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kovid.sakila.entities.Actor;
import com.kovid.sakila.repositories.ActorRepository;

/**
 * @author pkumar
 *
 */
@Service
public class ActorService {
	@Autowired
	private ActorRepository actorRespository;

	public List<Actor> getAllActors() {
		List<Actor> lstActor = new ArrayList<Actor>();
		actorRespository.findAll().forEach(lstActor::add);
		return lstActor;
	}

	public Actor getActor(int actorid) {
		return actorRespository.findOne(actorid);
	}

	public void addActor(Actor actor) {
		actorRespository.save(actor);
	}

	public void updateActor(Actor actor) {
		actorRespository.save(actor);
	}

	public void deleteActor(int id) {
		actorRespository.delete(id);
	}
	
	public List<Actor> getActorsByFName(String firstName){
		return actorRespository.findByFirstName(firstName);
	}
}
