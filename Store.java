import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<User> users;
    private List<Media> medias;

public Store() {
    this.users = new ArrayList<>();
   this. medias = new ArrayList<>();
}

public void addUser(User user) {
        users.add(user);}

public void addMedia(Media media) {
        medias.add(media);}


public void displayUsers(){
    for (User user : users) {
        System.out.println("Username: " + user.getUsername() + ", Email: " + user.getEmail());
}}

public void displayMedias(){
    for (Media media : medias) {
        System.out.println(media);}
}
    public Book searchBook(String title) {
        for (Media media : medias) {
            if (media.getClass() == Book.class && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
            return null;
}}


















