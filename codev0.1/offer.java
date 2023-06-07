import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class offer {
    private int id;
    private int restaurantID;
    private String name;
    private String description;
    private float discount;
    private float minSpent;
    private String couponcode;
    private String city;
    private String restaurantName;
    
    private static Map<Integer, offer> offerMap = new HashMap<>(); // Map to store offers by id
    
    // Constructor
    public offer(int id, int restaurantID, String name, String description, float discount, float minSpent, String couponcode, String city, String restaurantName) {
        this.id = id;
        this.restaurantID = restaurantID;
        this.name = name;
        this.description = description;
        this.discount = discount;
        this.minSpent = minSpent;
        this.couponcode = couponcode;
        this.city = city;
        this.restaurantName = restaurantName;

    }
    // Method to add a new offer
    public static void addNewOffer(int id, int restaurantID, String name, String description, float discount, float minSpent, String couponcode, String city, String restaurantName) {
        offer offer = new offer(id, restaurantID, name, description, discount, minSpent, couponcode, city, restaurantName);
        offerMap.put(id, offer);
        System.out.println("Offer added successfully.");

    }
// Method to update the discount and/or minSpent of an offer using id
public static void updateOfferInfo(int id, float newDiscount, float newMinSpent) {
    offer offer = offerMap.get(id);
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
        offer offer = offerMap.remove(id);
        if (offer != null) {
            System.out.println("Offer deleted successfully.");
        } else {
            System.out.println("Offer not found.");
        }
    }


    // Method to get all cities with offers
    public static List<String> getCitiesWithOffers() {
        List<String> citiesWithOffers = new ArrayList<>();
        for (offer offer : offerMap.values()) {
            if (!citiesWithOffers.contains(offer.getCity())) {
                citiesWithOffers.add(offer.getCity());
            }
        }
        return citiesWithOffers;
    }

    // Method to get all restaurants in a selected city with offers
public static List<Integer> getRestaurantsInCityWithOffers(String city) {
    List<Integer> restaurantsInCityWithOffers = new ArrayList<>();
    for (offer offer : offerMap.values()) {
        if (offer.getCity().equalsIgnoreCase(city)) {
            restaurantsInCityWithOffers.add(offer.getRestaurantID());
        }
    }
    return restaurantsInCityWithOffers;
}
// Method to get offers of a selected restaurant
public static List<offer> getOffersOfRestaurant(int restaurantID) {
    List<offer> offersOfRestaurant = new ArrayList<>();
    for (offer offer : offerMap.values()) {
        if (offer.getRestaurantID() == restaurantID) {
            offersOfRestaurant.add(offer);
        }
    }
    return offersOfRestaurant;
}

// Getter and Setter methods for the restaurantName variable
public String getRestaurantName() {
    return restaurantName;
}

public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
}

// Getter methods for other variables
public int getId() {
    return id;
}

public int getRestaurantID() {
    return restaurantID;
}

public String getName() {
    return name;
}

public String getDescription() {
    return description;
}

public String getCouponCode() {
    return couponcode;
}

public float getDiscount() {
    return discount;
}

public void setDiscount(float discount) {
    this.discount = discount;
}

public float getMinSpent() {
    return minSpent;
}

public void setMinSpent(float minSpent) {
    this.minSpent = minSpent;
}

public String getCity() {
    return city;
}

public static void main(String[] args) {
    // Adding offers
    offer.addNewOffer(1, 1, "Discounted Pizza", "Get 20% off on all pizzas", "PIZZA20", 20.0f, 50.0f, "New York", "Pizza Palace");
    offer.addNewOffer(2, 2, "Lunch Special", "Special lunch combo for just $10", "LUNCH10", 0.0f, 10.0f, "Chicago", "Burger Bistro");
    offer.addNewOffer(3, 1, "Free Dessert", "Get a free dessert with any order", "DESSERTFREE", 0.0f, 0.0f, "New York", "Pizza Palace");
    offer.addNewOffer(4, 3, "Family Meal Deal", "Enjoy a family meal for only $30", "FAMILY30", 10.0f, 30.0f, "Los Angeles", "Mexican Grill");
    offer.addNewOffer(5, 4, "Happy Hour Drinks", "Half-price drinks from 5 PM to 7 PM", "HAPPYHOUR", 50.0f, 0.0f, "San Francisco", "Cocktail Lounge");
    offer.addNewOffer(6, 2, "Breakfast Buffet", "All-you-can-eat breakfast buffet for $15", "BREAKFAST15", 0.0f, 15.0f, "Chicago", "Burger Bistro");
    offer.addNewOffer(7, 5, "Weekend Brunch", "Brunch specials every Saturday and Sunday", "BRUNCH20", 20.0f, 0.0f, "Miami", "Cafe Delight");
    offer.addNewOffer(8, 6, "Combo Meal Deal", "Get a burger, fries, and a drink for $8", "COMBO8", 0.0f, 8.0f, "Seattle", "Fast Bites");
    offer.addNewOffer(9, 7, "Student Discount", "10% off for students with valid ID", "STUDENT10", 10.0f, 0.0f, "Boston", "Diner's Delight");
    offer.addNewOffer(10, 8, "Weekend Special", "Exclusive weekend offer for our loyal customers", "WEEKEND20", 20.0f, 0.0f, "New York", "The Steakhouse");


    Scanner scanner = new Scanner(System.in);

    // Step 1: Display all cities with offers
    List<String> citiesWithOffers = offer.getCitiesWithOffers();
    System.out.println("Cities with offers: ");
    for (String city : citiesWithOffers) {
        System.out.println(city);
    }

    // Step 2: User selects a city
    System.out.print("Enter a city name: ");
    String selectedCity = scanner.nextLine();

    // Step 3: Display all restaurants in the selected city with offers
    List<Integer> restaurantsWithOffers = offer.getRestaurantsInCityWithOffers(selectedCity);
    System.out.println("Restaurants in " + selectedCity + " with offers: ");
    for (int restaurantID : restaurantsWithOffers) {
        offer offer = offer.offerMap.get(restaurantID);
        System.out.println(offer.getRestaurantName());
    }

    // Step 4: User selects a restaurant by its restaurantName
    System.out.print("Enter a restaurant name: ");
    String selectedRestaurantName = scanner.nextLine();

    int selectedRestaurantID = -1;

    // Find the restaurant ID based on the selected restaurant name
    for (offer offer : offer.offerMap.values()) {
        if (offer.getRestaurantName().equalsIgnoreCase(selectedRestaurantName)) {
            selectedRestaurantID = offer.getRestaurantID();
            break;
        }
    }

    // Step 5: Display list of offers of the selected restaurant
    List<offer> offersOfSelectedRestaurant = offer.getOffersOfRestaurant(selectedRestaurantID);
    if (offersOfSelectedRestaurant.isEmpty()) {
        System.out.println("Sorry, there are no offers for this restaurant.");
    } else {
        System.out.println("Offers of " + selectedRestaurantName + ": ");
        for (offer offer : offersOfSelectedRestaurant) {
            System.out.println("- " + offer.getName());
        }
    }

    // Step 6: User chooses an offer by its name
    System.out.print("Enter the name of the offer: ");
    String selectedOfferName = scanner.nextLine();

    // Step 7: The system prints all the information of the selected offer
    offer selectedOffer = null;
    for (offer offer : offersOfSelectedRestaurant) {
        if (offer.getName().equalsIgnoreCase(selectedOfferName)) {
            selectedOffer = offer;
            break;
        }
    }

    if (selectedOffer != null) {
        System.out.println("Offer details:");
        System.out.println("ID: " + selectedOffer.getId());
        System.out.println("Name: " + selectedOffer.getName());
        System.out.println("Description: " + selectedOffer.getDescription());
        System.out.println("Coupon Code: " + selectedOffer.getCouponCode());
        System.out.println("Discount: " + selectedOffer.getDiscount() + "%");
        System.out.println("Minimum Spending: $" + selectedOffer.getMinSpent());
    } else {
        System.out.println("Offer not found.");
    }

    // Step 9: End the use case
    scanner.close();
}
}

