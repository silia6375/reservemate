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
    public Event(int eventID, int restaurantID, String name, String description, Date start_time, Date end_time) {
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
        if (event.getCity().equalsIgnoreCase(city)) {
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
                event.setDescription(newDescription);
            }
            if (newStartTime != null) {
                event.setStartTime(newStartTime);
            }
            if (newEndTime != null) {
                event.setEndTime(newEndTime);
            }
            System.out.println("Event updated successfully.");
        } else {
            System.out.println("Event not found.");
        }
    }

}