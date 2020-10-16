package com.ronin.bootweb.service;

import org.springframework.stereotype.Service;

/**
 * This is a simple service that just formats a String to say "hello" to
 * whatever name is passed in.  In a more realistic scenario, this could 
 * contain business logic, database calls, etc.
 */
@Service
public class HelloService {

	public String sayHello(String name) {
                       return String.format("Hello %s!",name);
	}
}

