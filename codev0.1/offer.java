import java.util.HashMap;
import java.util.Map;

public class Offer {
    private int id;
    private int restaurantID;
    private String name;
    private String description;
    private float discount;
    private float minSpent;
    
    private static Map<Integer, Offer> offerMap = new HashMap<>(); // Map to store offers by id
    
    // Constructor
    public Offer(int id, int restaurantID, String name, String description, float discount, float minSpent) {
        this.id = id;
        this.restaurantID = restaurantID;
        this.name = name;
        this.description = description;
        this.discount = discount;
        this.minSpent = minSpent;
    }