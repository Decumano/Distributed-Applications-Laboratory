package practice.data.clients;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String phoneNumber;
    private List<Integer> interestStations;     // Id liist of all the Stations the user is interested in
    private String telegramToken;                  // Token of the bot

    /**
     * Creator of the class with defined values
     * @param phoneNumber the phone number of the created client
     * @param interestSations the list of all the stations id the client is interested in
     * @param telegramToken the token of the bot the client is tied with
     */
    public Client(String phoneNumber, List<Integer> interestStations, String telegramToken) {
        this.phoneNumber = phoneNumber;
        this.interestStations = interestStations;
        this.telegramToken = telegramToken;
    }

    /**
     * Creator of the class with defined values
     * @param phoneNumber the phone number of the created client
     * @param interestSation a single station id the client is interested in
     * @param telegramToken the token of the bot the client is tied with
     */
    public Client(String phoneNumber, int interestStation, String telegramToken) {
        this.phoneNumber = phoneNumber;
        this.interestStations.add(interestStation);
        this.telegramToken = telegramToken;
    }

    /**
     * Default creator of the class client
     */
    public Client() {
        phoneNumber = "";
        interestStations = new ArrayList<Integer>();
        telegramToken = "";
    }

    /**
     * Getter of the telegram token
     */
    public String getTelegramToken() {
        return telegramToken;
    }

    /**
     * Setter of the telegram token
     * @param telegramToken new definition of the value
     */
    public void setTelegramToken(String telegramToken) {
        this.telegramToken = telegramToken;
    }

    /**
     * Getter of the interest locations list
     */
    public List<Integer> getInterestStations() {
        return interestStations;
    }

    /**
     * Setter of the interest locations list
     * @param interestStations new value of the interest locations list
     */
    public void setInterestStations(List<Integer> interestStations) {
        this.interestStations = interestStations;
    }

    /**
     * Method to add a single stationt to the interest stations list
     */
    public void addInterestStation(int interestStation)
    {
        interestStations.add(interestStation);
    }

    /**
     * Getter of the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter of the phone number
     * @param phoneNumber is the new updated value of the phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
