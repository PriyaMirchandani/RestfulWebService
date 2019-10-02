package com.zensar.webservice.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")      //uri
public class HelloService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
  public String sayPlainHello()
  {
	  return "Welcome to zensar hello service";
  }
  @Path("/html")
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String sayHtmlHello()
  {
	  return "<h1>Welcome to zensar.</h1>";
  }
  @Path("/xml")
  @GET
  @Produces(MediaType.TEXT_XML)
    public String sayXmlHello()
    {
    	return "<?xml version='1.0'?><hello>welcome to zensar</hello>";
    }
  
}