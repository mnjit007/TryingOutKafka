package com.kafka.example.resource;

import com.kafka.example.initialsetup.SampleMsgTransformer;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;

/**
 * Created by manjit on 14-Oct-17.
 */

@Path("/helloworld")
public class ExampleRestService {

    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        return new SampleMsgTransformer().convertStringToJson("HELLO WORLD!");
    }

    @GET
    @Path("/kafka")
    @Produces("application/json")
    public String kafkaProducer() {

        return "";
    }
}
