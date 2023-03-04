package practice.service;

import org.springframework.web.client.RestTemplate;
import java.lang.System;
import practice.data.bicing.Data;

public class getStations {
    private static Data data;
    private static long start = 0;

    public getStations()
    {
        data = new Data();
    }
    
    public getStations(Data s){
        data = s;
    }

    public long getStart() {return start;}
    public void longsetStart(long s) {start = s;}

    public static boolean timerNotOn()
    {
        return (start == 0);
    }

    public static void startTimer()
    {
        start = System.currentTimeMillis();
    }

    public static void resetTimer()
    {
        start = 0;
    }

    public static boolean timerFinished()
    {
        return (((int)((System.currentTimeMillis() - start)/60000)) >= 10);
    }

    static public Data getStationsData()
    {
        if (!timerNotOn())
        {
            if (timerFinished())
            {
                resetTimer();
                data = null;
            }
        }
        if (timerNotOn())
        {
            startTimer();
            data = new RestTemplate()
            .getForObject("https://api.bsmsa.eu/ext/api/bsm/gbfs/v2/en/station_status", Data.class);
        }
        return data;
    }
}
