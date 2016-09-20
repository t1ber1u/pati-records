package com.unicamp.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("status")
public class Status {

	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getStatus() {
        return "I'm up!";
    }
}
