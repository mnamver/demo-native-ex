package com.example;

import jakarta.inject.Inject;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    @Inject
    EntityManager entityManager;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println("gogo");
        return "Hello RESTEasy";
    }

    @GET
    @Path("/list")
    @Transactional
    public List<Airways> getAllAirways() {

        try {
            List<Airways> list = entityManager.createQuery("SELECT a FROM Airways a", Airways.class)
                    .setMaxResults(10)
                    .getResultList();
            return list;
        } catch (Exception e) {
            // Log the exception for debugging purposes.
            e.printStackTrace();
            throw new RuntimeException("Error fetching Airways data.");
        }
    }

}



