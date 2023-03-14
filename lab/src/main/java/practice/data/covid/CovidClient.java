package practice.data.covid;

import java.util.Iterator;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import practice.telegram.client.Message;

public class CovidClient {

	static String covidURL = "https://analisi.transparenciacatalunya.cat/resource";
	static String covidPath = "/jvut-jxu8.json";
	
	static long id = 5925337525L;
	
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		
		WebTarget targetGet = client.target(covidURL).path(covidPath).queryParam("$limit", 10); 
		
		List<CovidRegion> covid_status = targetGet.request(MediaType.APPLICATION_JSON_TYPE)
				.header("X-App-Token", "efEArxd8Xh7N4RGrhndtnhWvJ")
				.get(new GenericType<List<CovidRegion>>() {});
		
		System.out.println("All covid status donwloaded..."); 
		
		for (Iterator<CovidRegion> iterator = covid_status.iterator(); iterator.hasNext();) {
			CovidRegion covid = iterator.next();
			//System.out.println("Region:" + covid.getNom()+ "Ingresos Totals:" + covid.getIngressos_total());
			
			Message message = new Message(id, "Region:" + covid.getNom()+ "Ingresos Totals:" + covid.getIngressos_total());
			WebTarget targetSendMessage = client.target("https://api.telegram.org").path("/bot5558130347:AAFAjEGRwEjmSnnZGbQU7ZmV-2ayjCM4jeU/sendMessage");
			String response = targetSendMessage.request().post(Entity.entity(message, MediaType.APPLICATION_JSON_TYPE),
					String.class);
		}
		
		
	}

}
