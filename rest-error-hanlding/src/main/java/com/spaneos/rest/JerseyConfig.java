package com.spaneos.rest;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.spaneos.rest.endpoint.Endpoint;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		packages("com.spaneos.rest");
		register(Endpoint.class);		 
	}

}