import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private String artist;

    public Music(String title, String author, String ISBN, double price, String artist) {
        super(title, author, ISBN, price);
        this.artist = artist;
    }

    public void listen(User user){  List<Music> playlist = new ArrayList<>();
        user.addPurchasedMediaList(this);
        //System.out.println("You are now listening " + this.getTitle() + " by " + this.getAuthor());
}

public List<Music> generatePlaylist(List<Music> musicCatalog){
    List<Music> playlist = new ArrayList<>();
    for (Music music :musicCatalog) {
        if (music.getAuthor().equals(this.getAuthor())) {
            playlist.add(music);
        }

    }
    return playlist;

}
public void setArtist(String artist) {
    this.artist = artist;}


public String getArtist() {

        return artist;
}

    @Override
    public String getMediaType() {
        if(getPrice()>=10){
            return "Premium Music";
        }else
            return "Music";}


    @Override
    public String toString() {
        return super.toString() +",Artist: " + artist;
    }}


