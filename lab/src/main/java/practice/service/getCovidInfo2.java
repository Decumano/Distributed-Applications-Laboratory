package practice.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import practice.data.covid.CovidRegion;

public class getCovidInfo2 {

    public getCovidInfo2()
    {
    }

    static public List<CovidRegion> getRegionData()
    {
        ResponseEntity<List<CovidRegion>> cR = new RestTemplate()
        .exchange(
            "https://analisi.transparenciacatalunya.cat/resource/jvut-jxu8.json",
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<CovidRegion>>() {
        });
        return cR.getBody();
    }
}
