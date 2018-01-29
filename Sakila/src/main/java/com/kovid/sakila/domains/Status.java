/**
 * 
 */
package com.kovid.sakila.domains;

/**
 * @author pkumar
 *
 */
public class Status {

	private String code;

	private String message;

	private String field;

	private String status;

	public Status() {

	}

	public Status(String status) {
		this.status = status;
	}


	public String getField() {
		return this.field;
	}

	public String getStatus() {
		return this.status;
	}
	public void setField(String field) {
		this.field = field;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
