package practice.data.clients;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String phoneNumber;
    private List<Integer> interestStations;
    private int telegramToken;

    public Client(String phoneNumber, List<Integer> interestStations, int telegramToken) {
        this.phoneNumber = phoneNumber;
        this.interestStations = interestStations;
        this.telegramToken = telegramToken;
    }

    public Client() {
        phoneNumber = "";
        interestStations = new ArrayList<Integer>();
        telegramToken = 0;
    }

    public int getTelegramToken() {
        return telegramToken;
    }

    public void setTelegramToken(int telegramToken) {
        this.telegramToken = telegramToken;
    }

    public List<Integer> getInterestStations() {
        return interestStations;
    }

    public void setInterestStations(List<Integer> interestStations) {
        this.interestStations = interestStations;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
