import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Offer {
    private int id;
    private int restaurantID;
    private String name;
    private String description;
    private float discount;
    private float minSpent;
    private String couponcode;
    
    private static Map<Integer, Offer> offerMap = new HashMap<>(); // Map to store offers by id
    
    // Constructor
    public Offer(int id, int restaurantID, String name, String description, float discount, float minSpent, String couponcode) {
        this.id = id;
        this.restaurantID = restaurantID;
        this.name = name;
        this.description = description;
        this.discount = discount;
        this.minSpent = minSpent;
        this.couponcode = couponcode;

    }
    // Method to add a new offer
    public static void addNewOffer(int id, int restaurantID, String name, String description, float discount, float minSpent, String couponcode) {
        Offer offer = new Offer(id, restaurantID, name, description, discount, minSpent, couponcode);
        offerMap.put(id, offer);
        System.out.println("Offer added successfully.");

    }
// Method to update the discount and/or minSpent of an offer using id
public static void updateOfferInfo(int id, float newDiscount, float newMinSpent) {
    Offer offer = offerMap.get(id);
    if (offer != null) {
        if (newDiscount >= 0) {
            offer.setDiscount(newDiscount);
        }
        if (newMinSpent >= 0) {
            offer.setMinSpent(newMinSpent);
        }
        System.out.println("Offer information updated successfully.");
    } else {
        System.out.println("Offer not found.");
    }
}


 // Method to delete an offer using id
    public static void deleteOffer(int id) {
        Offer offer = offerMap.remove(id);
        if (offer != null) {
            System.out.println("Offer deleted successfully.");
        } else {
            System.out.println("Offer not found.");
        }
    }


    // Method to get all cities with offers
    public static List<String> getCitiesWithOffers() {
        List<String> citiesWithOffers = new ArrayList<>();
        for (Offer offer : offerMap.values()) {
            if (!citiesWithOffers.contains(offer.getCity())) {
                citiesWithOffers.add(offer.getCity());
            }
        }
        return citiesWithOffers;
    }


}