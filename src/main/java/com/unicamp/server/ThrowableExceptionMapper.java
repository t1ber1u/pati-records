package com.unicamp.server;

import javax.validation.ValidationException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ThrowableExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable t) {
        if (t instanceof ValidationException) {
            return Response.serverError().entity(((ValidationException) t).getMessage()).build();
        } else {
            return Response.serverError().entity("").build();
        }
    }
}
