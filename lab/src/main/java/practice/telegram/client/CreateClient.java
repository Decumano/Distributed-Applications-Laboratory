package practice.telegram.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class CreateClient {

	public static void main(String[] args) {
		long id = 5925337525L;
		Message message = new Message(id, "hi");
		Client client = ClientBuilder.newClient();
		WebTarget targetSendMessage = client.target("https://api.telegram.org")
				.path("/bot5558130347:AAFAjEGRwEjmSnnZGbQU7ZmV-2ayjCM4jeU/sendMessage");
		String response = targetSendMessage.request().post(Entity.entity(message, MediaType.APPLICATION_JSON_TYPE),
				String.class);
	}

}
