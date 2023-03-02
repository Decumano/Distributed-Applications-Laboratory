package practice.data.clients;

import java.util.ArrayList;
import java.util.List;

public class Clients {
    private List<Client> clients; // list of all clients

    /**
     * Default creator of the class
     */
    public Clients() {
        clients = new ArrayList<Client>();
    }

    /**
     * Creator of the class with stablished attribute
     * @param clients the list of clients there are
     */
    public Clients(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * Getter of the client list
     */
    public List<Client> getClients() {
        return clients;
    }

    /**
     * Setter of the client list
     * @param clients the new list of clients
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public boolean hasClient(String phone)
    {
        int size = clients.size();
        for (int i = 0; i < size; i++)
        {
            Client c = clients.get(i);
            if (c.getPhoneNumber().equals(phone))
            {
                return true;
            }
        }
        return false;
    }

    public Client getClient(String phone)
    {
        int size = clients.size();
        for (int i = 0; i < size; i++)
        {
            Client c = clients.get(i);
            if (c.getPhoneNumber().equals(phone))
            {
                return c;
            }
        }
        return null;
    }
}
