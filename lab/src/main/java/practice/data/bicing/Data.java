package practice.data.bicing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import practice.data.covid.CovidRegion;
import practice.service.getClients;
import practice.telegram.client.Message;

public class Data {
	
	static long id = 5925337525L;
	
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

    public List<FreeSlotsStations> getSlots(List<Integer> interestStations)
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
    
    public void getFreeSlots(List<Integer> interestStations)
    {
    	Client client = ClientBuilder.newClient();
						
		Message message = new Message(id, getSlots(interestStations).toString());
		WebTarget targetSendMessage = client.target("https://api.telegram.org").path("/bot5558130347:AAFAjEGRwEjmSnnZGbQU7ZmV-2ayjCM4jeU/sendMessage");
		String response = targetSendMessage.request().post(Entity.entity(message, MediaType.APPLICATION_JSON_TYPE),
				String.class);		
    }
}
