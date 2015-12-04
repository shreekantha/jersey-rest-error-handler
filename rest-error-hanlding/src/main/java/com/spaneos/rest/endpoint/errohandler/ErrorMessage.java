package com.spaneos.rest.endpoint.errohandler;

import javax.ws.rs.core.Response.Status;

/**
 * @author Shreekantha
 *
 */
public class ErrorMessage {
	
	private Status statusCode;
	private String message;
	private String developerMsg;
	private String exception;
	
	
	 ErrorMessage(Status statusCode, String message, String developerMsg,
			String exception) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.developerMsg = developerMsg;
		this.exception = exception;
	}
	
	/**
	 * @return the statusCode
	 */
	public Status getStatusCode() {
		return statusCode;
	}
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @return the developerMsg
	 */
	public String getDeveloperMsg() {
		return developerMsg;
	}
	
	/**
	 * @return the exception
	 */
	public String getException() {
		return exception;
	}
	/**
	 * @param exception the exception to set
	 */
	public void setException(String exception) {
		this.exception = exception;
	}
	
	public static ErrorMessageBuilder statusCode(Status httpStatus){
		ErrorMessageBuilder builder=new ErrorMessageBuilder(httpStatus);
		return builder;
	}

}