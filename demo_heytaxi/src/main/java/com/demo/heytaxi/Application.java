package com.demo.heytaxi;

import org.glassfish.jersey.server.ResourceConfig;

public class Application extends ResourceConfig{
	private final String PACKAGE_NAME=Application.class.getPackage().getName(); 
	public Application (){
		packages(PACKAGE_NAME);
	}
	
}
