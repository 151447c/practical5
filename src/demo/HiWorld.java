package demo;

/**
 * Created by 151447c on 11/14/2016.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hi")
public class HiWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hi world!";
    }
    @GET
    @Produces(MediaType.TEXT_XML)
    public String getXMLMessage(){
        return "Hi world!";
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHTMLMessage(){
        return "Hi world!";
    }
}
