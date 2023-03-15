package practice.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestParam;

import practice.data.bicing.Data;
import practice.data.bicing.FreeSlotsStations;
import practice.data.bicing.Station;
import practice.data.clients.Client;
import practice.data.clients.Clients;
import practice.data.covid.CovidRegion;

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
    @Path("/Get/FreeSlots")
    @Produces(MediaType.APPLICATION_JSON)
    public void getFreeSlots(@RequestParam("PhoneNumber")String PhoneNumber)
    {
        List<Integer> c = getClients.getClientsData().getClient(PhoneNumber).getInterestStations();//getStations.getFreeSlots(PhoneNumber);
        Data s = getStations.getStationsData();
        s.getFreeSlots(c);
    }

    @GET
    @Path("/Get/CovidInfo")
    @Produces(MediaType.APPLICATION_JSON)
    public void getCovidInfo()
    {
        getCovidInfo.getRegionData();
    }
}
