import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String Email;
    private List<Media> purchasedMediaList;
    private List<Media> shoppingCart;
    public User(String username, String email) {
        this.username = username;
        this.Email = email;
        this.purchasedMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();

    }


public void addToCart(Media media) {

        shoppingCart.add(media);
 }
 public void removeFromCart(Media media) {
   shoppingCart.remove(media);


 }
    public void checkout() {
        for (Media media : shoppingCart) {
            if (media instanceof Book) {
                ((Book) media).purchase(this);
            } else if (media.getClass() == Movie.class) {
                ((Movie) media).watch(this);
            } else if (media.getClass() == Music.class) {
                ((Music) media).listen(this);
            }
        }
        shoppingCart.clear();
    }

  public void addPurchasedMediaList(Media media) {
    }




 public void setUsername(String username) {
    this.username = username;
 }
 public void setEmail(String email) {

        Email = email;
 }
 public void setPurchasedMediaList(List<Media> purchasedMediaList) {

        this.purchasedMediaList = purchasedMediaList;
 }
 public void setShoppingCart(List<Media> shoppingCart) {

        this.shoppingCart = shoppingCart;
 }
 public String getUsername() {

        return username;
    }
public String getEmail() {

        return Email;
    }
public List<Media> getPurchasedMediaList() {

        return purchasedMediaList;
    }
public List<Media> getShoppingCart() {

        return shoppingCart;
    }
}