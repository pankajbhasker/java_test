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
public class FilmCategory {
	@Id
	@Column(name="film_id")
	private Integer filmId;
	@Column(name="category_id")
	private Integer categoryId;
	@Column(name="last_update")
	private Date lastUpdate;
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
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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
