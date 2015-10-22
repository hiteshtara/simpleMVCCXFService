package com.luckyryan.sample.service;

import com.luckyryan.sample.exception.InvalidUserException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ExceptionHandler implements ExceptionMapper<InvalidUserException> {
    public Response toResponse(InvalidUserException exception) {
        Response.Status status;
        pritate static final Logger logger = LoggerFactory (ExceptionHandler.class)
  //Hitesh making changes to this module 
        status = Response.Status.INTERNAL_SERVER_ERROR;

        return Response.status(status).header("exception", exception.getMessage()).build();
    }
}