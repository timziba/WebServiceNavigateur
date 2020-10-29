package service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/Hello")
public class HelloService {
	
	@GET
	@Path("/{value}")
	public Response getMessage(@PathParam("value") String message) {
		
		String output = "Jesersey respond : " +message;
		return Response.status(200).entity(output).build();
	}

}
