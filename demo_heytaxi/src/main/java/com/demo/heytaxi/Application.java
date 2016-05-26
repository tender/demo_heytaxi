package com.demo.heytaxi;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class Application extends ResourceConfig{
	private final String PACKAGE_NAME=Application.class.getPackage().getName(); 
	public Application (){
		packages(PACKAGE_NAME);
	}
	
}
