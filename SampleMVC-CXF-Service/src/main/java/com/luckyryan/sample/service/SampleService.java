package com.luckyryan.sample.service;

import com.luckyryan.sample.dao.model.User;
import com.luckyryan.sample.exception.InvalidUserException;

/**
 * User: ryan
 * Date: 2/8/13
 */
public interface SampleService {

    public User saveUser(User user) throws InvalidUserException;

}
