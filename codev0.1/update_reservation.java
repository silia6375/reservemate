import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reservation {
    private int reservationID;
    private int userID;
    private int restaurantID;
    private String restaurant;
    private int numPeople;
    private int tableNum;
    private String date;
    private String time;
    
    // List to store reservations
    private static List<Reservation> reservations = new ArrayList<>();
    
    // Constructor
    public Reservation(int reservationID, int userID, int restaurantID, String restaurant,
                       int numPeople, int tableNum, String date, String time) {
        this.reservationID = reservationID;
        this.userID = userID;
        this.restaurantID = restaurantID;
        this.restaurant = restaurant;
        this.numPeople = numPeople;
        this.tableNum = tableNum;
        this.date = date;
        this.time = time;
    }
