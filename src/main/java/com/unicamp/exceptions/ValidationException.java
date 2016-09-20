package com.unicamp.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class ValidationException extends WebApplicationException {
	private static final long serialVersionUID = 1L;

	public ValidationException(String message) {
		
		super(Response.status(Response.Status.BAD_REQUEST).
		entity(message).type("text/plain").build());
	}
}
