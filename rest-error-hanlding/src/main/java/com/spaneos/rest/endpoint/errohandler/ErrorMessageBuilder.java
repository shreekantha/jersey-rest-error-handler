package com.spaneos.rest.endpoint.errohandler;
import java.util.Objects;

import javax.ws.rs.core.Response.Status;

/**
 * @author Shreekantha
 *
 */
public class ErrorMessageBuilder {
	
	private Status statusCode;
	private String message;
	private String developerMsg;
	private String exception;

	 ErrorMessageBuilder(Status statusCode) {
		super();
		this.statusCode = statusCode;
	}


	public static ErrorMessageBuilder statusCode(Status httpStatus){
		ErrorMessageBuilder errorMessageBuilder=new ErrorMessageBuilder(httpStatus);
		return errorMessageBuilder;
	}
	
	public ErrorMessageBuilder message(String message){
		this.message=message;
		return this;
	}

	public ErrorMessageBuilder developerMsg(String developerMsg){
		this.developerMsg=developerMsg;
		return this;
	}
	public ErrorMessageBuilder exception(String exception){
		this.exception=exception;
		return this;
	}
	public ErrorMessage build(){
		Objects.requireNonNull(this.statusCode,"statusCode must not be null");
		ErrorMessage errorMessage=new ErrorMessage(this.statusCode, this.message, this.developerMsg, this.exception);
		return errorMessage;
	}
}