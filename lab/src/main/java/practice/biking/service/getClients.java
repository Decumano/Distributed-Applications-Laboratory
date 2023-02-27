package practice.biking.service;

import java.util.ArrayList;

import practice.biking.data.Client;
import practice.biking.data.Clients;

public class getClients {
    private static Clients clientsInfo;

    public getClients(Clients clientsInfo) {
        getClients.clientsInfo = clientsInfo;
    }

    public getClients() {
        clientsInfo = new Clients();
    }

    public Clients getClientsInfo() {
        return clientsInfo;
    }

    public void setClientsInfo(Clients clientsInfo) {
        getClients.clientsInfo = clientsInfo;
    }

    static public Clients getClientsData()
    {
        // Test

        if (clientsInfo == null)
            clientsInfo = new Clients();

        Client c1 = new Client("656648346", new ArrayList<Integer>(), 5);
        c1.getInterestStations().add(2);
        c1.getInterestStations().add(5);
        c1.getInterestStations().add(15);
        c1.getInterestStations().add(16);
        c1.getInterestStations().add(22);

        Client c2 = new Client("658663895", new ArrayList<Integer>(), 20);
        c2.getInterestStations().add(1);
        c2.getInterestStations().add(13);
        c2.getInterestStations().add(19);
        c2.getInterestStations().add(20);
        c2.getInterestStations().add(30);

        clientsInfo.getClients().add(c1);
        clientsInfo.getClients().add(c2);

        //Test
        
        return clientsInfo;
    }
}
