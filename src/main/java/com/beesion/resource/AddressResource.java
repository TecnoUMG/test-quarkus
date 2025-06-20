package com.beesion.resource;

import com.beesion.model.Address;
import com.beesion.service.AddressService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/address")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AddressResource {

    @Inject
    AddressService service;

    @POST
    public void create(Address address) {
        service.create(address);
    }

    @GET
    public List<Address> list() {
        return service.listAll();
    }
}
