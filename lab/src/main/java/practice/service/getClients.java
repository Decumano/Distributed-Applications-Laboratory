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
        return clientsInfo;
    }

    static public void subscribe(String phone, int station, String token)
    {
        if (clientsInfo == null)
            clientsInfo = new Clients();
        if (clientsInfo.hasClient(phone))
        {
            Client c = clientsInfo.getClient(phone);
            c.addInterestStation(station);
            if (!(c.getTelegramToken() == token))
                c.setTelegramToken(token);
        }
        else
            clientsInfo.getClients().add(new Client(phone, station, token));
    }
}
