package practice.biking.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import practice.biking.data.Clients;
import practice.biking.data.Data;

import javax.ws.rs.core.MediaType;

@Path("/Get")
public class Service {
    @GET
    @Path("/Stations")
    @Produces(MediaType.APPLICATION_JSON)
    public Data getStationsData()
    {
        return getStations.getStationsData();
    }

    @GET
    @Path("/Clients")
    @Produces(MediaType.APPLICATION_JSON)
    public Clients getClientsData()
    {
        return getClients.getClientsData();
    }
}
