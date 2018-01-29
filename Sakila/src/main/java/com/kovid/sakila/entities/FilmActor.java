/**
 * 
 */
package com.kovid.sakila.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author pkumar
 *
 */
@Entity
public class FilmActor {
	@Id
	@Column(name="actor_id")
	private Integer actorId;
	@Column(name="film_id")
	private Integer filmId;
	@Column(name="last_update")
	private Date lastUpdate;
	/**
	 * @return the actorId
	 */
	public Integer getActorId() {
		return actorId;
	}
	/**
	 * @param actorId the actorId to set
	 */
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	/**
	 * @return the filmId
	 */
	public Integer getFilmId() {
		return filmId;
	}
	/**
	 * @param filmId the filmId to set
	 */
	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}
	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}
	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
}
