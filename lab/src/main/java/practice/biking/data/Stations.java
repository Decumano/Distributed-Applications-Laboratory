package practice.biking.data;
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
}