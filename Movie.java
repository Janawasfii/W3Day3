import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private int duration;

public Movie(String title, String author, String ISBN, double price, int duration) {
        super(title, author, ISBN, price);
        this.duration = duration;}


public void watch(User user){
        user.addPurchasedMediaList(this);
       // System.out.println("You've watched the movie.");
    }


public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        List<Movie> recommendations = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (movie.getAuthor().equals(this.getAuthor())) {
                recommendations.add(movie);}}
             return recommendations;}

public void setDuration(int duration) {
        this.duration = duration;
    }

public int getDuration() {
    return duration;
}


   @Override
public String getMediaType() {
                if(duration>=120){
                    return "Long Movie";
                }else
                    return "Movie";
            }

    @Override
    public String toString() {
        return super.toString() + ",Duration "+ duration+" minutes.";
    }}

