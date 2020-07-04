package pe.edu.upc.boundary;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greeting")
public class GreetingResource {

    @GET
    public String greet(){
        return "Hello UPC";
    }
}
