package practice.data.bicing;
import java.util.ArrayList;

import java.util.List;

public class Stations {
    private List<Station> stations;

    public Stations(List<Station> stations) {
        this.stations = stations;
    }

    public Stations() {
        stations = new ArrayList<Station>();
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public boolean hasStation(int id)
    {
        int stationsSize = stations.size();
        for (int i = 0; i < stationsSize; i++)
        {
            Station s = stations.get(i);
            if (id == s.getStation_id())
            {
                return true;
            }
        }
        return false;
    }

    public Station getStation(int id)
    {
        int stationsSize = stations.size();
        for (int i = 0; i < stationsSize; i++)
        {
            Station s = stations.get(i);
            if (id == s.getStation_id())
            {
                return s;
            }
        }
        return null;
    }
}