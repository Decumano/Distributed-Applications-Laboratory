package practice.biking.data;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Path;

@Path("/Stations")
public class Stations {
    private List<Station> stations;

    public Stations(List<Station> stations) {
        this.stations = stations;
    }

    public Stations() {
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    @GET
    @Path("/GetAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Station> getStationsData()
    {
        Client client = ClientBuilder.newClient();
        WebTarget bicingJSON = client.target("https://api.bsmsa.eu").path("ext/api/bsm/gbfs/v2/en/station_status");
        stations = bicingJSON.request(MediaType.APPLICATION_JSON_TYPE).get(new GenericType<List<Station>>() {});
        return stations;
    }
}