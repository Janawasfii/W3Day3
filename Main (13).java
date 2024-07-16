//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Kafka on the shore", "Haruki Murakami", "978-0-06-094466-2", 50.39, 50);
        Book book2 = new Book("The 48 laws of power", "Robert Greene", "979-0-482-28823-4", 80.99, 0);



        Novel novel1 = new Novel("The Alchemist ", "Paulo Coelho", "978-0-061-12241-5", 20.17, 20, "Fiction");
        Novel novel2 = new Novel("The Silent Patient", "Alex Michaelides", "978-1-409-18163-7", 10.53, 40, "Mystery");

        AcademicBook academicBook1 = new AcademicBook("Psychiatric Mental Health", "Theresa Moses", "978-1-975-18477-3", 78.95, 15, "Mental illness");
        AcademicBook academicBook2 = new AcademicBook("Applied pathophysiology", "Bernard C.Beins", "978-1-111-921947-7", 14.99, 25, "Health Education");

        Movie movie1 = new Movie("The Shawshank Redemption", "Frank Darabont", "978-0-01-234567-8", 14.99, 142);
        Movie movie2 = new Movie("Inception", "Christopher Nolan", "978-0-98-765432-1", 12.99, 148);

        Music music1 = new Music("Clair de Lune", "Claude Debussy", "978-0-12-345678-9", 19.90, "Claude Debussy");
        Music music2 = new Music("Respect", "Aretha Franklin", "978-0-87-654321-0", 87.59, "Aretha Franklin");

        Store store = new Store();
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(novel1);
        store.addMedia(novel2);
        store.addMedia(academicBook1);
        store.addMedia(academicBook2);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(music1);
        store.addMedia(music2);


        User user1 = new User("Jana", "janawasfi@gmail.com");
        User user2 = new User("Jenan", "jenanwasfi@gmail.com");
        store.addUser(user1);
        store.addUser(user2);

        Book searchBook = store.searchBook("The Shawshank Redemption");
        if (searchBook != null) {
            System.out.println(searchBook);
            System.out.println("Book is found.");

        }else System.out.println("Book is not found");





        book1.addReview(new Review("Yara", 4.6, "I enjoyed reading this."));
        book1.addReview(new Review("Lara", 4.9, "Highly recommend it."));

        academicBook2.addReview(new Review("Jana", 4.0, "A good read."));
        academicBook2.addReview(new Review("Noura", 4.3, "Helpful."));

        book2.addReview(new Review("Lama", 4.9, "One of my favorites."));
        novel2.addReview(new Review("Sara", 4.5, "Interesting."));




        System.out.println("Average rating of Kafka on the shore book: "+ book1.getAverageRating() + "\n");
        System.out.println("Average rating of Applied pathophysiology book: " + academicBook2.getAverageRating()+ "\n");


        user1.addToCart(book1);
        user1.addToCart(movie1);
        user1.checkout();

        user2.addToCart(novel1);
        user2.addToCart(music1);
        user2.checkout();

        System.out.println("ISBN for Kafka on the shore book is: "+ book1.getISBN());

        book2.restock(0);
        novel2.getGenre();



        System.out.println("Available Media:");
        store.displayMedias();
        System.out.println("\nRegistered Users:");
        store.displayUsers();

    }
}