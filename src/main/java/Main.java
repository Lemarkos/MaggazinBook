public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Lord of the Rings");
        Book book2 = new Book("Harry Potter");
        Book book3 = new Book("Fight club");
        Magazine magazine1 = new Magazine("Vogue");
        Magazine magazine2 = new Magazine("Forbs");
        Magazine magazine3 = new Magazine("Variety");
        Printable[] printable = {book1,book2,book3, magazine1,magazine2,magazine3};
        
        Magazine.printMagazines(printable);
        Book.printBooks(printable);
    }
}
