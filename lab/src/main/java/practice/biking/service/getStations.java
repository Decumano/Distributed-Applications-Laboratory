package practice.biking.service;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import practice.biking.data.Data;
import practice.biking.data.Stations;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@Path("/Stations")
public class getStations {
    private Data data;

    public getStations()
    {
        data = new Data();
    }
    
    public getStations(Data s){
        data = s;
    }

    @GET
    @Path("/GetAll")
    @Produces(MediaType.APPLICATION_JSON)
    public Data getStationsData()
    {
        /*
        Client client = ClientBuilder.newClient();
        WebTarget bicing = client.target("https://api.bsmsa.eu").path("ext/api/bsm/gbfs/v2/en/station_status");
        JSONObject bicingJSON = bicing.request(MediaType.APPLICATION_JSON_TYPE).get(new GenericType<JSONObject>() {});
        Gson gson = new Gson();
        data.setData(gson.fromJson(bicingJSON.toString(), Stations.class));
        */

        data = new RestTemplate()
        .getForObject("https://api.bsmsa.eu/ext/api/bsm/gbfs/v2/en/station_status", Data.class);

        return data;
    }
}
