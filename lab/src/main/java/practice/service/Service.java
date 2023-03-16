package practice.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import practice.data.bicing.Data;
import practice.data.clients.Clients;
import practice.telegram.client.Message;

@Path("/Service")
public class Service {

	static String telegramURL = "https://api.telegram.org";
	static String telegramPath = "/bot5558130347:AAFAjEGRwEjmSnnZGbQU7ZmV-2ayjCM4jeU/sendMessage";
	/*
	 * "/botTOKEN" in telegramPath
	 */
	static long id = 5925337525L; /* chat id */

	@GET
	@Path("/Get/Stations")
	@Produces(MediaType.APPLICATION_JSON)
	public Data getStationsData() {
		return getStations.getStationsData();
	}

	@GET
	@Path("/Get/Clients")
	@Produces(MediaType.APPLICATION_JSON)
	public Clients getClientsData() {
		return getClients.getClientsData();
	}

	@GET
	@Path("/Subscribe")
	public void subscribe(@QueryParam("PhoneNumber") String PhoneNumber, @QueryParam("Station") int station,
			@QueryParam("Token") String token) {
		getClients.subscribe(PhoneNumber, station, token);
	}

	@GET
	@Path("/Get/FreeSlots")
	@Produces(MediaType.APPLICATION_JSON)
	public void getFreeSlots(@QueryParam("PhoneNumber2") String PhoneNumber) {
		if (getClients.getClientsData().hasClient(PhoneNumber)) {
			List<Integer> c = getClients.getClientsData().getClient(PhoneNumber).getInterestStations();
			Data s = getStations.getStationsData();
			s.getFreeSlots(c);
		} else {
			String m = "Phone number " + PhoneNumber + " not subscribed to Bicing Service";
			Message message = new Message(id, m);
			Client client = ClientBuilder.newClient();
			WebTarget targetSendMessage = client.target(telegramURL).path(telegramPath);
			String response = targetSendMessage.request().post(Entity.entity(message, MediaType.APPLICATION_JSON_TYPE),
					String.class);
		}
	}

	@GET
	@Path("/Get/CovidInfo")
	@Produces(MediaType.APPLICATION_JSON)
	public void getCovidInfo() {
		getCovidInfo.getRegionData();
	}
}
