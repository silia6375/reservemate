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

}