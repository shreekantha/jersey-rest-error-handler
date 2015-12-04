package com.spaneos.rest.endpoint.errohandler;

public class RestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -581691080082887162L;
	private ErrorMessage errorMessage;

	public RestException() {
		super();
	}

	public RestException(ErrorMessage errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

}
