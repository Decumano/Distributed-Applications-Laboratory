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
     * @param interestStations the list of all the stations id the client is interested in
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
     * @param interestStation a single station id the client is interested in
     * @param telegramToken the token of the bot the client is tied with
     */
    public Client(String phoneNumber, int interestStation, String telegramToken) {
        this.phoneNumber = phoneNumber;
        this.interestStations = new ArrayList<Integer> ();
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
     * Checks if there is a certain station
     * @param interestStation
     * @return True/False
     */
    public boolean hasInterestStation(int interestStation)
    {
        int size = interestStations.size();
        for (int i = 0; i < size; i++)
        {
            int s = interestStations.get(i);
            if (s == interestStation)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to add a single stationt to the interest stations list
     */
    public void addInterestStation(int interestStation)
    {
        if (interestStations == null)
            interestStations = new ArrayList<Integer>();
        if (!hasInterestStation(interestStation))
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
