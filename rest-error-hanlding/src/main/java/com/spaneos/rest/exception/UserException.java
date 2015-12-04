package com.spaneos.rest.exception;

public class UserException extends RuntimeException {

	private static final long serialVersionUID = -5583684862771421511L;
	
	private final String message;

	public UserException() {
		super();
		message="User exception";
	}

	public UserException(String message) {
		super(message);
		this.message=message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	

}
