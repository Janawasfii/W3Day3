public class Review {
    private String username;
    private double Rating;
    private String comment;


    public Review(String username, double rating, String comment) {
        this.username = username;
        Rating = rating;
        this.comment = comment;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public void setRating(int rating) {
        Rating = rating;
    }
    public void setComment(String comment) {

        this.comment = comment;
    }
    public String getUsername() {
        return username;
    }
    public double getRating() {
        return Rating;
    }
    public String getComment() {

        return comment;
    }
}
