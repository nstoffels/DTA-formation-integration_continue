/**
 * 
 */
package com.bankonet.web;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.bankonet.model.Client;


/**
 * @author ETY
 *
 */

@Path("/clients")
public class BankonetWeb{
	


	/*
	 * 
	 * Section constructeur
	 * 
	 */
	
	/**
	 * constructeur par défaut
	 */
	public BankonetWeb() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@EJB private BankonetService bankonetService;
	/*
	 * 
	 * 
	 * section méthode
	 * 
	 * 
	 */
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/{id}") 
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id") @DefaultValue("1") Client id) {
		try{
			ResponseBuilder builder = Response.ok("bienvenue");
			builder.language("fr").header("Content-type", "text/html");
			builder.status(200);
			System.out.println("dedans");
			return builder.build();	
		}catch(Exception e){
			ResponseBuilder builder = Response.ok("interdit");
			builder.language("fr").header("Content-type", "text/html");
			builder.status(400);
			System.out.println("raté");
			
		};
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Client> list() {
		int i = 0;
		List<Client> list = bankonetService.getNomClient();
		for(Client client : list){
			++i;
			System.out.println("le client n° : "+i+" est "+client.getNom());
		}
		/*
		 * ResponseBuilder builder = Response.ok(list);
		 * builder.status(200);
		 * builder.header("Access-Control-...");
		 * 
		 */
		
	return list;
	}
	
}
