package br.com.tbm.resource;

import java.util.Date;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ejb")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class SimpleRESTEJB {
	
	
    @GET
    public String ejb() {
        return "ejb okaaa @ " + new Date().toString();
    }
}