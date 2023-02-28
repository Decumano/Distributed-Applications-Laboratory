package practice.service;

import java.util.ArrayList;

import practice.data.clients.Client;
import practice.data.clients.Clients;

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

        Client c1 = new Client("656648346", new ArrayList<Integer>(), "6837");
        c1.addInterestStation(2);
        c1.addInterestStation(5);
        c1.addInterestStation(15);
        c1.addInterestStation(16);
        c1.addInterestStation(22);
        
        Client c2 = new Client("658663895", new ArrayList<Integer>(), "674520");
        c2.addInterestStation(1);
        c2.addInterestStation(13);
        c2.addInterestStation(19);
        c2.addInterestStation(20);
        c2.addInterestStation(30);

        clientsInfo.getClients().add(c1);
        clientsInfo.getClients().add(c2);

        //Test
        
        return clientsInfo;
    }

    static public void subscribe(String phone, int station)
    {
        if (clientsInfo == null)
            clientsInfo = new Clients();
        if (clientsInfo.hasClient(phone))
            clientsInfo.getClient(phone).addInterestStation(station);
        else
            clientsInfo.getClients().add(new Client(phone, station, ""));
    }
}
