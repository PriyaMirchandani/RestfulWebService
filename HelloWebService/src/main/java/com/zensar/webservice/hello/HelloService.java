package com.zensar.webservice.hello;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


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
  @GET
  @Path("/{nm}")
  @Produces("text/plain")
  public String sayHelloWebService(@PathParam("nm")String name) {
	  return "Dear"+name+"welcome to zensar services";
  }
  @GET
  @Path("res/{nm}/{dd}/{mm}/{yy}")
  @Produces("text/plain")
  public Response sayHappyBirthday (@PathParam("nm")String name,@PathParam("dd")int day,@PathParam("mm")int month,@PathParam("yy")int year) {
	  LocalDate birthDate=LocalDate.of(1997,11, 7);
	  Response res= Response.status(200).entity("Dear"+name+"Happy bday on"+birthDate+"welcome to zensar service").build();
	  return res;
  }
  
}
