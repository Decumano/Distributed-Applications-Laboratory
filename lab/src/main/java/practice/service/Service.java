package practice.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import practice.data.bicing.Data;
import practice.data.clients.Clients;
import practice.data.covid.CovidRegions;

@Path("/Service")
public class Service {
    @GET
    @Path("/Get/Stations")
    @Produces(MediaType.APPLICATION_JSON)
    public Data getStationsData()
    {
        return getStations.getStationsData();
    }

    @GET
    @Path("/Get/Clients")
    @Produces(MediaType.APPLICATION_JSON)
    public Clients getClientsData()
    {
        return getClients.getClientsData();
    }

    @GET
    @Path("/Subscribe")
    public void subscribe(@QueryParam("PhoneNumber")String PhoneNumber, @QueryParam("Station")int station, @QueryParam("Token")String token)
    {
            getClients.subscribe(PhoneNumber, station, token);
    }

    @GET
    @Path("/Get/CovidInfo")
    @Produces(MediaType.APPLICATION_JSON)
    public CovidRegions getCovidInfo()
    {
        return getCovidInfo.getRegionData();
    }
}
