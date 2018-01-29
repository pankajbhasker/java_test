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
public class Film {
	@Id
	@Column(name="film_id")
	private int filmId;
	private String title;
	private String description;
	@Column(name="release_year")
	private String releaseYear;
	@Column(name="language_id")
	private int languageId;
	@Column(name="original_language_id")
	private int originalLanguageId;
	@Column(name="rental_duration")
	private int rentalDuration;
	@Column(name="rental_rate")
	private float rentalRate;
	private int length;
	@Column(name="replacement_cost")
	private float replacementCost;
	private String rating;
	@Column(name="special_features")
	private String specialFeatures;
	@Column(name="last_update")
	private Date lastUpdate;
	/**
	 * @return the filmId
	 */
	public int getFilmId() {
		return filmId;
	}
	/**
	 * @param filmId the filmId to set
	 */
	public void setFilmId(int filmId) {
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
	/**
	 * @return the releaseYear
	 */
	public String getReleaseYear() {
		return releaseYear;
	}
	/**
	 * @param releaseYear the releaseYear to set
	 */
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	/**
	 * @return the languageId
	 */
	public int getLanguageId() {
		return languageId;
	}
	/**
	 * @param languageId the languageId to set
	 */
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	/**
	 * @return the originalLanguageId
	 */
	public int getOriginalLanguageId() {
		return originalLanguageId;
	}
	/**
	 * @param originalLanguageId the originalLanguageId to set
	 */
	public void setOriginalLanguageId(int originalLanguageId) {
		this.originalLanguageId = originalLanguageId;
	}
	/**
	 * @return the rentalDuration
	 */
	public int getRentalDuration() {
		return rentalDuration;
	}
	/**
	 * @param rentalDuration the rentalDuration to set
	 */
	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	/**
	 * @return the rentalRate
	 */
	public float getRentalRate() {
		return rentalRate;
	}
	/**
	 * @param rentalRate the rentalRate to set
	 */
	public void setRentalRate(float rentalRate) {
		this.rentalRate = rentalRate;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the replacementCost
	 */
	public float getReplacementCost() {
		return replacementCost;
	}
	/**
	 * @param replacementCost the replacementCost to set
	 */
	public void setReplacementCost(float replacementCost) {
		this.replacementCost = replacementCost;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * @return the specialFeatures
	 */
	public String getSpecialFeatures() {
		return specialFeatures;
	}
	/**
	 * @param specialFeatures the specialFeatures to set
	 */
	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
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
