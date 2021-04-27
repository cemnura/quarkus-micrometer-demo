package org.acme.resources;

import io.micrometer.core.annotation.Timed;
import io.micrometer.datadog.DatadogMeterRegistry;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.Random;

@Path("/registry")
public class RegistryResource {

/*
    @Inject
    DatadogMeterRegistry registry;

    Random random = new Random();

    @POST
    @Path("count")
    public void count() {
        double randomIncrement = getRandomIncrement();
        registry.counter("counter").increment(randomIncrement);
    }

    @POST
    @Path("gauge/{number}")
    public void gauge(@PathParam("number") Long number){
        registry.gauge("gauge", number);
    }

    @Timed
    private double getRandomIncrement() {
        return random.nextDouble();
    }
*/

}