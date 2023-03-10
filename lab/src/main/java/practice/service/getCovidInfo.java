package practice.service;

import org.springframework.web.client.RestTemplate;

import practice.data.covid.CovidRegions;

public class getCovidInfo {
    private static CovidRegions data;

    public getCovidInfo()
    {
        data = new CovidRegions();
    }
    
    public getCovidInfo(CovidRegions s){
        data = s;
    }

    static public CovidRegions getRegionData()
    {
        if (data.isEmpty() || data == null)
        {
            data = new RestTemplate()
            .getForObject("https://analisi.transparenciacatalunya.cat/resource/jvut-jxu8.json", CovidRegions.class);
        }
        return data;
    }
}
