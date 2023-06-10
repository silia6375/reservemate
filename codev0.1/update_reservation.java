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

    // Method to get all reservations for a user
    public static List<Reservation> getUserReservations(int userID) {
        List<Reservation> userReservations = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.userID == userID) {
                userReservations.add(reservation);
            }
        }
        return userReservations;
    }
    
    public static void main(String[] args) {
        // Add 5 reservation objects with the same userID but different dates
        Reservation reservation1 = Reservation.createNewReservation(1, 123, 456, "Restaurant XYZ",
                2, 4, "2023-06-10", "19:30");
        Reservation reservation2 = Reservation.createNewReservation(2, 123, 789, "Restaurant ABC",
                4, 5, "2023-06-12", "18:00");
        Reservation reservation3 = Reservation.createNewReservation(3, 123, 789, "Restaurant DEF",
                3, 8, "2023-06-15", "20:30");
        Reservation reservation4 = Reservation.createNewReservation(4, 123, 789, "Restaurant GHI",
                6, 2, "2023-06-18", "21:00");
        Reservation reservation5 = Reservation.createNewReservation(5, 123, 789, "Restaurant JKL",
                2, 6,                "2023-06-21", "17:30");

                // Display all reservations
        System.out.println("All Reservations:");
        for (Reservation reservation : reservations) {
            reservation.getReservationInfo();
            System.out.println("------------------------------");
        }

        // Prompt the user to choose a reservation to update
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Reservation ID to update: ");
        int reservationIDToUpdate = scanner.nextInt();

        // Find the chosen reservation to update
        Reservation reservationToUpdate = null;
        for (Reservation reservation : reservations) {
            if (reservation.reservationID == reservationIDToUpdate) {
                reservationToUpdate = reservation;
                break;
            }
        }

        // Update the chosen reservation if found
        if (reservationToUpdate != null) {
            System.out.print("Enter the new number of people: ");
            int numPeople = scanner.nextInt();
            System.out.print("Enter the new date: ");
            String date = scanner.next();
            System.out.print("Enter the new time: ");
            String time = scanner.next();



            // Update the reservation
            reservationToUpdate.updateReservationInfo(numPeople, date, time);
            System.out.println("Reservation updated successfully:");
            reservationToUpdate.getReservationInfo();
            System.out.println("Changes have been saved.");
            System.out.println("A confirmation email has been sent.");
        } else {
            System.out.println("Reservation not found!");
        }

        // Close the scanner
        scanner.close();
    }
}