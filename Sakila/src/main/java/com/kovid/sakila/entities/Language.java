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
public class Language {
	@Id
	@Column(name="languageId")
	private Integer languageId;
	private String name;
	@Column(name="last_update")
	private Date lastUpdate;
	/**
	 * @return the languageId
	 */
	public Integer getLanguageId() {
		return languageId;
	}
	/**
	 * @param languageId the languageId to set
	 */
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
