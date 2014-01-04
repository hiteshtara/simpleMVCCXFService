package com.luckyryan.sample.ws;

import com.luckyryan.sample.dto.SignupForm;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// REST Setup (Follows JAX-RS)
@Path("/sampleService")
@Produces("application/json")
public interface SampleServiceREST {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/saveForm")
    public SignupForm saveFrom(SignupForm signupForm);

}
