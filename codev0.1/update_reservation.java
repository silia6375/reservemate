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
// Method to create a new reservation object
public static Reservation createNewReservation(int reservationID, int userID, int restaurantID, String restaurant,
int numPeople, int tableNum, String date, String time) {
Reservation reservation = new Reservation(reservationID, userID, restaurantID, restaurant, numPeople, tableNum, date, time);
reservations.add(reservation);
return reservation;
}

// Method to update reservation information
public void updateReservationInfo(int numPeople, String date, String time) {
this.numPeople = numPeople;
this.date = date;
this.time = time;
}


    // Method to delete the reservation
    public void deleteReservation() {
        reservations.remove(this);
    }
    
    // Method to get reservation information
    public void getReservationInfo() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("User ID: " + userID);
        System.out.println("Restaurant ID: " + restaurantID);
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Number of People: " + numPeople);
        System.out.println("Table Number: " + tableNum);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
