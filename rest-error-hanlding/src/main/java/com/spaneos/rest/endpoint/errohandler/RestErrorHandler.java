package com.spaneos.rest.endpoint.errohandler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RestErrorHandler implements ExceptionMapper<RuntimeException> {

	@Override
	public Response toResponse(RuntimeException exception) {
		Response response = null;
		if (exception instanceof RestException) {
			RestException ex = (RestException) exception;
			response = Response.status(ex.getErrorMessage().getStatusCode())
					.entity(ex.getErrorMessage()).build();
		}
		return response;
	}

}
