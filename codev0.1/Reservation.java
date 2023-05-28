import java.util.*;

class Restaurant {
    private String name;
    private String city;
    private String information;
    private List<String> photos;

    public Restaurant(String name, String city, String information, List<String> photos) {
        this.name = name;
        this.city = city;
        this.information = information;
        this.photos = photos;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getInformation() {
        return information;
    }

    public List<String> getPhotos() {
        return photos;
    }
}

class Reservation {
    private String restaurantName;
    private String day;
    private String time;
    private int numberOfPeople;

    public Reservation(String restaurantName, String day, String time, int numberOfPeople) {
        this.restaurantName = restaurantName;
        this.day = day;
        this.time = time;
        this.numberOfPeople = numberOfPeople;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }
}

class TableReservation {
    private String restaurantName;
    private String table;
    private String email;

    public TableReservation(String restaurantName, String table, String email) {
        this.restaurantName = restaurantName;
        this.table = table;
        this.email = email;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getTable() {
        return table;
    }

    public String getEmail() {
        return email;
    }
}

class RestaurantReservationSystem {
    private List<Restaurant> restaurants;
    private Map<String, List<String>> tableAvailability;

    public RestaurantReservationSystem() {
        restaurants = new ArrayList<>();
        tableAvailability = new HashMap<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void setTableAvailability(String restaurantName, List<String> tables) {
        tableAvailability.put(restaurantName, tables);
    }

    public void displayMainMenu() {
        System.out.println("Welcome to the Restaurant Reservation System!");
        System.out.println("Please select a city to make a reservation:");
        // Implement code to display the list of available cities
        // and handle user input
    }

    public void displayRestaurants(String city) {
        System.out.println("Restaurants in " + city + ":");
        // Implement code to display the list of restaurants in the city
        // and handle user input
    }

    public void displayRestaurantDetails(Restaurant restaurant) {
        System.out.println("Restaurant: " + restaurant.getName());
        System.out.println("City: " + restaurant.getCity());
        System.out.println("Information: " + restaurant.getInformation());
        // Implement code to display restaurant photos
    }

    public Reservation getReservationDetails(String restaurantName) {
        // Implement code to get reservation details from the user
        // such as day, time, and number of people attending
        return new Reservation(restaurantName, "Monday", "18:00", 2);
    }

    public String chooseTable(String restaurantName) {
        // Implement code to display the floor plan and available tables
        // and handle user input to choose a table
        return "Table A";
    }

    public void completeReservation(TableReservation reservation) {
        // Implement code to process the reservation and send confirmation email
        System.out.println("Reservation completed!");
        System.out.println("Restaurant:");
        
        import java.util.*;

class Restaurant {
    private String name;
    private String city;
    private String information;
    private List<String> photos;

    public Restaurant(String name, String city, String information, List<String> photos) {
        this.name = name;
        this.city = city;
        this.information = information;
        this.photos = photos;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getInformation() {
        return information;
    }

    public List<String> getPhotos() {
        return photos;
    }
}

class Reservation {
    private String restaurantName;
    private String day;
    private String time;
    private int numberOfPeople;

    public Reservation(String restaurantName, String day, String time, int numberOfPeople) {
        this.restaurantName = restaurantName;
        this.day = day;
        this.time = time;
        this.numberOfPeople = numberOfPeople;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }
}

class TableReservation {
    private String restaurantName;
    private String table;
    private String email;

    public TableReservation(String restaurantName, String table, String email) {
        this.restaurantName = restaurantName;
        this.table = table;
        this.email = email;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getTable() {
        return table;
    }

    public String getEmail() {
        return email;
    }
}

class RestaurantReservationSystem {
    private List<Restaurant> restaurants;
    private Map<String, List<String>> tableAvailability;

    public RestaurantReservationSystem() {
        restaurants = new ArrayList<>();
        tableAvailability = new HashMap<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void setTableAvailability(String restaurantName, List<String> tables) {
        tableAvailability.put(restaurantName, tables);
    }

    public void displayMainMenu() {
        System.out.println("Welcome to the Restaurant Reservation System!");
        System.out.println("Please select a city to make a reservation:");
        // Implement code to display the list of available cities
        // and handle user input
    }

    public void displayRestaurants(String city) {
        System.out.println("Restaurants in " + city + ":");
        // Implement code to display the list of restaurants in the city
        // and handle user input
    }

    public void displayRestaurantDetails(Restaurant restaurant) {
        System.out.println("Restaurant: " + restaurant.getName());
        System.out.println("City: " + restaurant.getCity());
        System.out.println("Information: " + restaurant.getInformation());
        // Implement code to display restaurant photos
    }

    public Reservation getReservationDetails(String restaurantName) {
        // Implement code to get reservation details from the user
        // such as day, time, and number of people attending
        return new Reservation(restaurantName, "Monday", "18:00", 2);
    }

    public String chooseTable(String restaurantName) {
        // Implement code to display the floor plan and available tables
        // and handle user input to choose a table
        return "Table A";
    }

    public void completeReservation(TableReservation reservation) {
        // Implement code to process the reservation and send confirmation email
        System.out.println("Reservation completed!");
        System.out.println("Restaurant:



        