import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;


public class Event {
    private int eventID;
    private int restaurantID;
    private String name;
    private String city;
    private String description;
    private Date start_time;
    private Date end_time;

    private static Map<Integer, Event> eventMap = new HashMap<>(); // Map to store events by eventID
    
    // Constructor
    public Event(int eventID, int restaurantID, String name, String city, String description, Date start_time, Date end_time) {
        this.eventID = eventID;
        this.restaurantID = restaurantID;
        this.name = name;
        this.city = city;
        this.description = description;
        this.start_time = start_time;
        this.end_time = end_time;
    }

   // Method to add a new event
   public static void addNewEvent(int eventID, int restaurantID, String name, String city, String description, Date start_time, Date end_time) {
    Event event = new Event(eventID, restaurantID, name, city, description, start_time, end_time);
    eventMap.put(eventID, event);
    System.out.println("Event added successfully.");
}

// Method to get all events in the same city
public static List<Event> getEventsInCity(String city) {
    List<Event> eventsInCity = new ArrayList<>();
    for (Event event : eventMap.values()) {
        if (event.city.equalsIgnoreCase(city)) 
            eventsInCity.add(event);
        }
    }
    return eventsInCity;
}

// Method to get the values of a specific event using eventID
public static Event getEvent(int eventID) {
    return eventMap.get(eventID);
}

    // Method to update the description, start_time, and/or end_time of an event using eventID
    public static void updateEvent(int eventID, String newDescription, Date newStartTime, Date newEndTime) {
        Event event = eventMap.get(eventID);
        if (event != null) {
            if (newDescription != null) {
                event.description = newDescription ;
            }
            if (newStartTime != null) {
                event.start_time = newStartTime ;
            }
            if (newEndTime != null) {
                event.end_time = newEndTime ;
            }
            System.out.println("Event updated successfully.");
        } else {
            System.out.println("Event not found.");
        }
    }
// Method to delete an event using eventID
public static void deleteEvent(int eventID) {
    Event event = eventMap.remove(eventID);
    if (event != null) {
        System.out.println("Event deleted successfully.");
    } else {
        System.out.println("Event not found.");
    }
}


// Getters and Setters 
public static void main(String[] args) {
    // Sample usage of the methods
    Date startTime = new Date(); // Replace with desired start time
    Date endTime = new Date(); // Replace with desired end time

    addNewEvent(1, 123, "Event 1", "City A", "Description 1", startTime, endTime);
    addNewEvent(2, 456, "Event 2", "City B", "Description 2", startTime, endTime);
    addNewEvent(3, 789, "Event 3", "City A", "Description 3", startTime, endTime);

    Scanner scanner = new Scanner(System.in);

    // Step 1: Display all cities with events
    System.out.println("Available cities with events:");
    List<String> citiesWithEvents = getCitiesWithEvents();
    for (String city : citiesWithEvents) {
        System.out.println(city);
    }

    // Step 2: User selects a city
    System.out.println("Enter the name of the city: ");
    String selectedCity = scanner.nextLine();

    // Step 3: Display all events in the selected city
    List<Event> eventsInCity = getEventsInCity(selectedCity);
    System.out.println("Events in " + selectedCity + ":");
    for (Event event : eventsInCity) {
        System.out.println(event.name);
    }

    // Step 4: User selects an event by its name
    System.out.println("Enter the name of the event: ");
    String selectedEvent = scanner.nextLine();

    // Step 5: Display event information
    Event event = getEventByName(selectedEvent);
    if (event != null) {
        System.out.println("Event Name: " + event.name);
        System.out.println("Event Description: " + event.description);
        System.out.println("Event Start Time: " + event.start_time);
        System.out.println("Event End Time: " + event.end_time);
    } else {
        System.out.println("Event not found.");
    }

    // Step 6: Prompt the user if they want to make a reservation
    System.out.println("Do you want to make a reservation for this event? (yes/no): ");
    String choice = scanner.nextLine();

    if (choice.equalsIgnoreCase("yes")) {
        // Step 7: Proceed with the reservation process
        System.out.println("Reservation process initiated...");
        // Add your reservation code here
    } else {
        System.out.println("Reservation not made. End of use case.");
    }

    // Step 8: End the use case
    scanner.close();
}

// Additional methods (to be implemented)

    // Method to get all cities with events
    public static List<String> getCitiesWithEvents() {
        List<String> citiesWithEvents = new ArrayList<>();
        for (Event event : eventMap.values()) {
            if (!citiesWithEvents.contains(event.city)) {
                citiesWithEvents.add(event.city);
            }
        }
        return citiesWithEvents;
    }

    // Method to get an event by its name
    public static Event getEventByName(String eventName) {
        for (Event event : eventMap.values()) {
            if (event.name.equalsIgnoreCase(eventName)) {
                return event;
            }
        }
        return null;
    }
