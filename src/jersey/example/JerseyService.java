package jersey.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/echo")
public class JerseyService {

   @GET
   @Path("/{param}")
   public Response echo(@PathParam("param") String msg) {

      String output = "Echo: " + msg;

      return Response.status(200).entity(output).build();
   }
}
