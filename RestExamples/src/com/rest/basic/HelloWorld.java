package com.rest.basic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/hello")
public class HelloWorld {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getUser() {

		return Response.status(200).entity("getUser is called").build();

	}
}
