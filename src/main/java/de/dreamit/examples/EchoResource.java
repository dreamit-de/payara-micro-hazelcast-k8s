package de.dreamit.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author llorenzen
 * @since 24.04.17
 */
@Path("/")
public class EchoResource {

    @GET
    public String getAnswer() {
        return "Hello from microP";
    }
}
