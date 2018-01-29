/**
 * 
 */
package com.kovid.sakila.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kovid.sakila.domains.Response;
import com.kovid.sakila.domains.Status;
import com.kovid.sakila.entities.Actor;
import com.kovid.sakila.services.ActorService;

/**
 * @author pkumar
 *
 */

@RestController
@RequestMapping("actor")
public class ActorController {
	@Autowired
	private ActorService actorService;

	@GetMapping("/all")
	public List<Actor> getAllActors() {
		return actorService.getAllActors();
	}

	@GetMapping("/{actorId}")
	public Actor getActor(@PathVariable(value = "actorId") int actorid) {
		// List<Actor> lstActor = new ArrayList<Actor>();
		// actorRepo.findAll().forEach(lstActor::add);
		// Actor actor = lstActor.stream().filter(a -> a.getActorId() ==
		// actorid).findFirst().get();
		return actorService.getActor(actorid);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Response addActor(@RequestBody Actor actor) {
		Response response = new Response();
		Status status = new Status();
		try {
			actorService.addActor(actor);
			status.setStatus("SUCCESS");
			status.setCode(HttpStatus.CREATED.toString());

		} catch (Exception e) {
			status.setStatus("FAILURE");
			status.setCode("101");
			e.printStackTrace();
		}
		response.setStatus(status);
		return response;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/update")
	public Response updateActor(@RequestBody Actor actor) {

		Response response = new Response();
		Status status = new Status();
		try {
			actorService.addActor(actor);
			status.setStatus("SUCCESS");
			status.setCode(HttpStatus.OK.toString());

		} catch (Exception e) {
			status.setStatus("FAILURE");
			status.setCode(HttpStatus.NOT_MODIFIED.toString());
			e.printStackTrace();
		}
		response.setStatus(status);
		return response;

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "delete/{actorid}")
	@ResponseStatus(value = HttpStatus.OK)
	public Response deleteActor(@PathVariable(value = "actorid") int id) {

		Response response = new Response();
		Status status = new Status();
		try {
			actorService.deleteActor(id);
			status.setStatus("SUCCESS");
			status.setCode(HttpStatus.OK.toString());
		} catch (Exception e) {
			status.setStatus("FAILURE");
			status.setCode("101");
			e.printStackTrace();
		}
		response.setStatus(status);
		return response;

	}

	@RequestMapping("/name/{firstName}")
	public List<Actor> getAllActorsByName(@PathVariable String firstName) {
		return actorService.getActorsByFName(firstName);
	}

}
