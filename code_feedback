import java.util.Scanner;
import java.util.Map;
import java.util.List;

public class Feedback {
    private class int reviewID;
    private class int userID;
    private class int restaurantID;
    private class int rating;
    private class string description;
    private class int likes;

    public static Map<Integer, Feedback> feedbackMap = new HashMap<>();
    
    public Feedback(int reviewID, int userID, int restaurantID, int rating, string description, int likes) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.restaurantID = restauratnID;
        this.rating = rating;
        this.description = description;
        this.likes = likes;
}

public static void createNewReview(int reviewID, int userID, int restaurantID, int rating, string description, int likes) {
    Feedback review = new Feedback(int reviewID, int userID, int restaurantID, int rating, string description, int likes);
    reviewMap.put(reviewID, review);
    System.out.println("Review added successfully.");
}

public static void updateReview(int rating, String description, int likes) {
    this.rating = rating;
    this.description = description;
    this.likes = likes;
}

public static void deleteReview(int reviewID) {
    Feedback review = getReviewById(reviewID);
     public void deleteReview(int reviewID) {
        Review review = getReviewByID(reviewID);
        if (review != null) {
            reviewList.remove(review);
            System.out.println("Review deleted successfully.");
        } else {
            System.out.println("Review not found.");
        }
    }
}
