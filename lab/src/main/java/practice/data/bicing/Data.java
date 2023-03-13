package practice.data.bicing;

import java.util.ArrayList;
import java.util.List;

import practice.service.getClients;

public class Data {
    private Stations data;

    public Data(){
    }

    public Data(Stations s)
    {
        data = s;
    }

    public Stations getData() {
        return data;
    }

    public void setData(Stations data) {
        this.data = data;
    }

    public List<FreeSlotsStations> getFreeSlots(List<Integer> interestStations)
    {
        List<FreeSlotsStations> slots = new ArrayList<FreeSlotsStations> () {};

        int iSsize = interestStations.size();
        Station s;
        for (int i = 0; i < iSsize; i++)
        {
            if (data.hasStation(interestStations.get(i)))
            {
                s = data.getStation(interestStations.get(i));
                slots.add(new FreeSlotsStations(s.getStation_id(), s.getNum_docks_available()));
            }
        }
        return slots;
    }
}
