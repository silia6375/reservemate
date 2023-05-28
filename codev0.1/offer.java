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

    // Method to get all restaurants in a selected city with offers
public static List<Integer> getRestaurantsInCityWithOffers(String city) {
    List<Integer> restaurantsInCityWithOffers = new ArrayList<>();
    for (Offer offer : offerMap.values()) {
        if (offer.getCity().equalsIgnoreCase(city)) {
            restaurantsInCityWithOffers.add(offer.getRestaurantID());
        }
    }
    return restaurantsInCityWithOffers;
}
// Method to get offers of a selected restaurant
public static List<Offer> getOffersOfRestaurant(int restaurantID) {
    List<Offer> offersOfRestaurant = new ArrayList<>();
    for (Offer offer : offerMap.values()) {
        if (offer.getRestaurantID() == restaurantID) {
            offersOfRestaurant.add(offer);
        }
    }
    return offersOfRestaurant;
}


}
// Getters and Setters 
    
public static void main(String[] args) {

    // Sample usage of the methods
    addNewOffer(1, 123, "Offer 1", "Description 1", "Coupon Code 1", 0.2f, 50.0f, "City A");

    Scanner scanner = new Scanner(System.in);

    // Step 1: Display all cities with offers
    List<String> citiesWithOffers = getCitiesWithOffers();
    System.out.println("Cities with offers: ");
    for (String city : citiesWithOffers) {
        System.out.println(city);
    }

    // Step 2: User selects a city
    System.out.println("Enter the name of the city: ");
    String selectedCity = scanner.nextLine();

    // Step 3: Display all restaurants in the selected city with offers
    List<Integer> restaurantsInCityWithOffers = getRestaurantsInCityWithOffers(selectedCity);
    System.out.println("Restaurants in " + selectedCity + " with offers: ");
    for (Integer restaurantID : restaurantsInCityWithOffers) {
        System.out.println("Restaurant ID: " + restaurantID);
        // Display other restaurant details if available
    }

    // Step 4: User selects a restaurant by its name
    System.out.println("Enter the name of the restaurant: ");
    String selectedRestaurantName = scanner.nextLine();

    // Step 5: Display list of offers of the selected restaurant
    int selectedRestaurantID = -1;
    for (Integer restaurantID : restaurantsInCityWithOffers) {
        // Match restaurant name with ID
        if (selectedRestaurantName.equalsIgnoreCase("Restaurant Name")) {
            selectedRestaurantID = restaurantID;
            break;
        }
    }

    if (selectedRestaurantID != -1) {
        List<Offer> offersOfRestaurant = getOffersOfRestaurant(selectedRestaurantID);

        // Step 6: If there are no offers, print "Sorry, there are no offers for this restaurant."
        if (offersOfRestaurant.isEmpty()) {
            System.out.println("Sorry, there are no offers for this restaurant.");
        } else {
            // Step 7: User chooses an offer by its name
            System.out.println("Enter the name of the offer: ");
            String selectedOfferName = scanner.nextLine();

            Offer selectedOffer = null;
            for (Offer offer : offersOfRestaurant) {
                if (selectedOfferName.equalsIgnoreCase(offer.getName())) {
                    selectedOffer = offer;
                    break;
                }
            }

            // Step 8: The system prints all the information of the selected offer
            if (selectedOffer != null) {
                System.out.println("Offer Information:");
                System.out.println("Offer Name: " + selectedOffer.getName());
                System.out.println("Offer Description: " + selectedOffer.getDescription());
                System.out.println("Offer Coupon Code: " + selectedOffer.getCouponcode());
                System.out.println("Offer Discount: " + selectedOffer.getDiscount());
                System.out.println("Offer Minimum Spent: " + selectedOffer.getMinSpent());
            } else {
                System.out.println("Offer not found.");
            }
        }
    } else {
        System.out.println("Restaurant not found.");
    }

    // Step 9: End the use case
    scanner.close();
}
}
