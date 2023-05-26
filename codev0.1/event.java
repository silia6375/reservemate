import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Event {
    private int eventID;
    private int restaurantID;
    private String name;
    private String description;
    private Date start_time;
    private Date end_time;

    private static Map<Integer, Event> eventMap = new HashMap<>(); // Map to store events by eventID
    
    // Constructor
    public Event(int eventID, int restaurantID, String name, String description, Date start_time, Date end_time) {
        this.eventID = eventID;
        this.restaurantID = restaurantID;
        this.name = name;
        this.description = description;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    // Method to add a new event
    public static void addNewEvent(int eventID, int restaurantID, String name, String description, Date start_time, Date end_time) {
        Event event = new Event(eventID, restaurantID, name, description, start_time, end_time);
        eventMap.put(eventID, event);
        System.out.println("Event added successfully.");
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