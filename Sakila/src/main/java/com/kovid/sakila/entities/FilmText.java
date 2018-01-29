/**
 * 
 */
package com.kovid.sakila.entities;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author pkumar
 *
 */
public class FilmText {
	@Id
	@Column(name="film_id")
	private Integer filmId;
	private String title;
	private String description;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
