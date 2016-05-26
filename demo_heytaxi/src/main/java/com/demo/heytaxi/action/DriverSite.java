package com.demo.heytaxi.action;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.glassfish.jersey.server.JSONP;

import com.demo.heytaxi.model.entity.Driver;

@Path("/driver")
public class DriverSite {
	
	@GET
	@Path("/{name}/find")
	@Produces({"application/json","application/javascript"})
	@JSONP(callback="eval",queryParam="jsonpCallback")
	public Driver findDriver(@PathParam("name") String name){
		Driver result=searchDriver(name);
		return result;
	}
	
	@GET
	@Path("/{name}/search")
	@Produces({"application/json","application/javascript"})
	@JSONP(callback="eval",queryParam="jsonpCallback")
	public List<Driver> findDrivers(@PathParam("name") String name){
		List<Driver> result=searchDrivers(name);
		return result;
	}
	
	
	private Driver searchDriver(String name){
		Driver result=new Driver();
		result.setName(name);
		result.setAge(40);
		result.setType("F");
		result.setId(new Long(100));
		return result;
	}
	
	private List<Driver> searchDrivers(String name){
		List<Driver> result=new ArrayList<Driver>();
		Driver vo=null;
		for(int i=0;i<10;i++){
			vo=searchDriver("Driver"+String.valueOf(i));
			vo.setAge(vo.getAge()+i);
			vo.setType((i%2==0)?"F":"M");
			result.add(vo);
		}
		return result;
		
	}
}
