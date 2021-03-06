package com.cor.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

/**
 * Created by adrianmilne on 04/08/2016.
 */
@Component
@Path("/demo")
public class HelloWorldService {

    @GET
    @Path("/hello")
    public Response test() {
        return Response.status(200).entity("Hello World").build();
    }

}
