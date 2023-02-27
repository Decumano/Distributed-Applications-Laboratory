package practice.biking.service;

import practice.biking.data.Data;
import org.springframework.web.client.RestTemplate;

public class getStations {
    private static Data data;

    public getStations()
    {
        data = new Data();
    }
    
    public getStations(Data s){
        data = s;
    }

    static public Data getStationsData()
    {
        data = new RestTemplate()
        .getForObject("https://api.bsmsa.eu/ext/api/bsm/gbfs/v2/en/station_status", Data.class);

        return data;
    }
}
