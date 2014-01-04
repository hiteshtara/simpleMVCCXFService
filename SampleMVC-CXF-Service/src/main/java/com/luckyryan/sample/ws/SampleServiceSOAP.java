package com.luckyryan.sample.ws;

import com.luckyryan.sample.dto.SignupForm;
import com.luckyryan.sample.exception.InvalidUserException;

import javax.jws.WebParam;
import javax.jws.WebService;

// SOAP Setup
@WebService
public interface SampleServiceSOAP {

    public SignupForm saveFrom(@WebParam(name="signupForm") SignupForm signupForm) throws InvalidUserException;
}