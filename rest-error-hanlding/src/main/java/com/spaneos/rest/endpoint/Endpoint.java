package com.spaneos.rest.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spaneos.rest.endpoint.errohandler.ErrorMessage;
import com.spaneos.rest.endpoint.errohandler.RestException;
import com.spaneos.rest.exception.UserException;
import com.spaneos.rest.service.UserService;

@Component
@Path("/test")
public class Endpoint {

	private static final Logger LOG = Logger.getLogger(Endpoint.class);

	@Autowired
	private UserService userService;

	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test() {

		try {
			LOG.info("Test method begins");
			return Response.status(Status.OK).entity(userService.test())
					.build();
		} catch (UserException e) {
			// ErrorMessage class to build a proper message to send response
			// back to user
			ErrorMessage message = ErrorMessage
					.statusCode(Status.CONFLICT)
					.message(e.getMessage())
					.developerMsg(
							"Unable to test user object , because object is null")
					.exception(e.getClass().getName()).build();
			throw new RestException(message);
		}

	}

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService
	 *            the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}