public class Media {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Media(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;

    }

    public void setTitle(String title) {

        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(String ISBN) {

        this.ISBN = ISBN;
    }
    public void setPrice(double price) {

        this.price = price;
    }
    public String getTitle(){

        return title;
    }
    public String getAuthor(){

        return author;
    }
    public String getISBN(){

        return ISBN;
    }
    public double getPrice(){

        return price;
    }

    public String getMediaType(){
    return "Media";

}

    @Override
    public String toString() {
        return "Title: " + title + ", Auteur: " + author + ", ISBN: " + ISBN + ", Price: " + price;
    }
    }
