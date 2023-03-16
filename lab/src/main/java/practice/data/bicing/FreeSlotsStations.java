package practice.data.bicing;

public class FreeSlotsStations {
	private int stationId;
	private int freeDocks;

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public int getFreeDocks() {
		return freeDocks;
	}

	public void setFreeDocks(int freeDocks) {
		this.freeDocks = freeDocks;
	}

	FreeSlotsStations(int id, int freeDocks) {
		stationId = id;
		this.freeDocks = freeDocks;
	}

	public String toString() {
		return "Station ID: " + Integer.toString(stationId) + "\nFree Docks: " + Integer.toString(freeDocks) + "\n";
	}
}