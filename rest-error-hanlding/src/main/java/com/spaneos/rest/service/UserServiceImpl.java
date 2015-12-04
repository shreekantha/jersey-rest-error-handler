package com.spaneos.rest.service;

import org.springframework.stereotype.Service;

import com.spaneos.rest.entity.User;
import com.spaneos.rest.exception.UserException;

@Service
public class UserServiceImpl implements UserService {
	// method to demonstrate throwing of an exception
	@Override
	public User test() {
		if ("a".equals("A")) {
			return new User("SDK", "sdk@sdk.com");
		}
		throw new UserException("User not tested");
	}

}
