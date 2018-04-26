package com.appspot.jerseyongae;

import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/v1")
public class MyApplication extends ResourceConfig {

    public MyApplication() {
        packages("com.appspot.jerseyongae.api");
        register(OpenApiResource.class);
    }
}
