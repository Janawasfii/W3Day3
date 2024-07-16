import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private int stock;
    private List<Review> reviews;

    public Book(String title, String author, String ISBN, double price,int stock) {
        super(title, author, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();

    }


    public void addReview (Review review){
// adds the reviews to the Book's list
               reviews.add(review);

    }
    public double getAverageRating () {
        //calculate the average rating
        if(reviews.isEmpty()) {
        return 0.0;}
        double Total=0.0;
        for(Review review : reviews){
        Total+=review.getRating();
        }return Total / reviews.size();
    }

    public void purchase (User user){
//Allows users to add the book to the purchased list and decrease book stock by 1.
      if(stock>0){
          user.addPurchasedMediaList(this);
          stock--;
       // System.out.println("Successfully added to your purchased list");
    }else{
          System.out.println("This book is out of stock.");}}


    public boolean isBestseller () {
        return getAverageRating() >= 4.5;}

    public void restock ( int quantity){
        // allows for restocking a book by increasing its quantity in stock. It also prints a message to inform about the restocking.
        stock += quantity;
        System.out.println("Book restocked, There are currently " +stock+ " in stock.");
}

    public void setStock ( int stock){
        this.stock = stock;
    }
    public int getStock () {

        return stock;
    }

    public List<Review> getReviews () {

        return reviews;
    }

     @Override
    public String getMediaType () {
        if (isBestseller()) {
            return "Bestselling Book";}
        else {
            return "Book";}}

    @Override
    public String toString () {
        return super.toString() + ", Quantity in Stock: " + stock + ", Average Rating: " + getAverageRating();
    }
    }

